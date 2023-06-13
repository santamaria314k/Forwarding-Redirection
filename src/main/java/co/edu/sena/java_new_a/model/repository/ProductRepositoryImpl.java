package co.edu.sena.java_new_a.model.repository;

import co.edu.sena.java_new_a.model.Beans.Product;
import co.edu.sena.java_new_a.model.util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements Repositoryproduct<Product> {

    private String sql = null;

    @Override
    public List<Product> listAllprod() throws SQLException {
        sql = "select P.id_product, P.name_product, P.value_product " +
                "from products P order by P.name_product, P.value_product";
        List<Product> products = new ArrayList<>();

        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Product product = createprod(rs);
                products.add(product);
            }
        }

        return products;
    }

    @Override
    public Product byIdprod(Integer id) throws SQLException {
        sql = "select P.id_product, P.name_product, P.value_product " +
                "from products P where P.id_product = ?";
        Product product = null;

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    product = createprod(rs);
                }
            }
        }

        return product;
    }

    @Override
    public int saveprod(Product product) throws SQLException {
        int rowsAffected = 0;

        if (product.getId_product() != null && product.getId_product() > 0) {
            sql = "update products set name_product=?, value_product=? " +
                    "where id_product=?";
        } else {
            sql = "insert into products(name_product, value_product) " +
                    "values(?, ?)";
        }

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, product.getName_product());
            ps.setString(2, product.getValue_product());
            if (product.getId_product() != null && product.getId_product() > 0) {
                ps.setInt(3, product.getId_product());
            }

            rowsAffected = ps.executeUpdate();
        }

        return rowsAffected;
    }

    @Override
    public void deleteprod(Integer id) throws SQLException {
        sql = "delete from products where id_product = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public Product createprod(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setId_product(rs.getInt("id_product"));
        product.setName_product(rs.getString("name_product"));
        product.setValue_product(rs.getString("value_product"));
        return product;
    }
}

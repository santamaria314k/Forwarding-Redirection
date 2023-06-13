package co.edu.sena.java_new_a.model.repository;

import co.edu.sena.java_new_a.model.Beans.Category;
import co.edu.sena.java_new_a.model.util.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryCateImpl implements RepositoryCate<Category> {

    private String sql = null;

    @Override
    public List<Category> listcate() throws SQLException {
        sql = "SELECT C.category_product, C.name_category " +
                "FROM categories C ORDER BY C.category_product, C.name_category";
        List<Category> catee = new ArrayList<>();

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Category category = createcate(rs);
                catee.add(category);
            }
        }

        return catee;
    }
    @Override
    public Category byIdcate(Integer id) throws SQLException {
        sql = "SELECT C.category_product, C.name_category " +
                "FROM categories C WHERE C.category_product = ?";
        Category category = null;

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    category = createcate(rs);
                }
            }
        }

        return category;
    }
    @Override
    public int sabeCate(Category category) throws SQLException {
        int rowsAffected = 0;

        if (category.getCategory_product() != null && category.getCategory_product() > 0) {
            sql = "UPDATE categories SET category_product=?, name_category=? " +
                    "WHERE category_product=?";
        } else {
            sql = "INSERT INTO categories(category_product, name_category) " +
                    "VALUES(?, upper(?))";
        }

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            if (category.getCategory_product() != null) {
                ps.setString(1, String.valueOf(category.getCategory_product()));
                ps.setString(2, category.getName_category());
                if (category.getCategory_product() > 0) {
                    ps.setInt(3, category.getCategory_product());
                }
            }

            rowsAffected = ps.executeUpdate();
        }

        return rowsAffected;
    }

    @Override
    public void deleteCate(Integer id) throws SQLException {
        sql = "DELETE FROM categories WHERE category_product = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
    @Override
    public Category createcate(ResultSet rs) throws SQLException {
        Category category = new Category();
        category.setCategory_product(rs.getInt("category_product"));
        category.setName_category(rs.getString("name_category"));
        return category;
    }
}

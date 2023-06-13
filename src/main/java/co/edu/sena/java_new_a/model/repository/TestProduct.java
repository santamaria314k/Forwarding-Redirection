package co.edu.sena.java_new_a.model.repository;

import co.edu.sena.java_new_a.model.Beans.Product;

import java.sql.SQLException;

public class TestProduct {

    public static void main(String[] args) throws SQLException {
        Repositoryproduct<Product> repository = new ProductRepositoryImpl();

        System.out.println("========== Insert ==========");
        Product productInsert1 = new Product();
        productInsert1.setId_product(1);
        productInsert1.setName_product("boom");
        productInsert1.setValue_product("200 pesos");
        repository.saveprod(productInsert1);

        Product productInsert2 = new Product();
        productInsert2.setId_product(2);
        productInsert2.setName_product("papas ");
        productInsert2.setValue_product("2000 pesos");
        repository.saveprod(productInsert2);

        System.out.println("==========listAll==========");
        repository.listAllprod().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byId ==========");
        System.out.println();

        System.out.println("========== save ==========");
        Product productUpdate = new Product();
        productUpdate.setId_product(2);
        productUpdate.setName_product("choco");
        productUpdate.setValue_product("5000 pesos");
        repository.saveprod(productUpdate);

        repository.listAllprod().forEach(System.out::println);
        System.out.println();

        System.out.println("========== delete ==========");
        repository.deleteprod(2);
        repository.listAllprod().forEach(System.out::println);
    }
}

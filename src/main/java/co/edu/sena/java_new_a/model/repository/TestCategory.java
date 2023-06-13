package co.edu.sena.java_new_a.model.repository;

import co.edu.sena.java_new_a.model.Beans.Category;

import java.sql.SQLException;

public class TestCategory {

    public static void main(String[] args )throws SQLException {
        RepositoryCate<Category> caterepo = new RepositoryCateImpl();
        System.out.println("==========insert  ==========");
        Category CATInsert = new Category();
        CATInsert.setCategory_product(1);
        CATInsert.setName_category("dulces");
        caterepo.sabeCate(CATInsert);

        CATInsert.setCategory_product(2);
        CATInsert.setName_category("fritos");
        caterepo.sabeCate(CATInsert);

        System.out.println("==========listAll==========");
        caterepo.listcate().forEach(System.out::println);
        System.out.println();
        System.out.println("========== byId ==========");

        System.out.println(caterepo.byIdcate(1));
        System.out.println();
        System.out.println("========== save ==========");
        Category actete = new Category();
        actete.setCategory_product(2);
        actete.setName_category("cops");
        caterepo.sabeCate(actete);

        caterepo.listcate().forEach(System.out::println);
        System.out.println();
        System.out.println("========== delete ==========");
        caterepo.deleteCate(2);
        caterepo.listcate().forEach(System.out::println);
    }




}

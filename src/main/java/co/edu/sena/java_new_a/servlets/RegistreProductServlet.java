package co.edu.sena.java_new_a.servlets;

import co.edu.sena.java_new_a.model.Beans.Product;
import co.edu.sena.java_new_a.model.repository.ProductRepositoryImpl;
import co.edu.sena.java_new_a.model.repository.Repositoryproduct;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/registerelpro")
public class RegistreProductServlet extends HttpServlet {


    @Override
    protected  void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Collect all form data
        String id_pro = request.getParameter("id_product");
        String name_product = request.getParameter("name_product");
        String value_product = request.getParameter("value_product");
    Integer idpros =null;

        if (id_pro != null && !id_pro.isEmpty()) {
            try {
                idpros = Integer.valueOf(id_pro);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        // Fill it up in a User bean
        Product prop = new Product(idpros,name_product, value_product);
        // Call Repository layer and save the user object to DB

        Repositoryproduct<Product> therepo = new ProductRepositoryImpl();
        int rows = 0;

        try {
            rows = therepo.saveprod(prop);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // todo Prepare an information message for the user about the success or failure of the operation
        if (rows == 0) {
            System.out.println("Ocurrió un error!");
        } else {
            System.out.println("Operación exitosa!");
        }

        // todo Write the message back to the page in the client browser

    }
}







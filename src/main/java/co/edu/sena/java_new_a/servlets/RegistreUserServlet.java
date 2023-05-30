package co.edu.sena.java_new_a.servlets;

import co.edu.sena.java_new_a.model.repository.Repository;

import co.edu.sena.java_new_a.model.Beans.User;

import co.edu.sena.java_new_a.model.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/registeruser")
public class RegistreUserServlet extends HttpServlet {

    @Override
    protected  void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Collect all form data
        String user_firstname = request.getParameter("user_firstname");
        String user_lastname = request.getParameter("user_lastname");
        String user_email = request.getParameter("user_email");
        String user_password = request.getParameter("user_password");

        // Fill it up in a User bean
        User user = new User(user_firstname, user_lastname, user_email, user_password);
        // Call Repository layer and save the user object to DB

        Repository<User> repository = new UserRepositoryImpl();
        int rows = 0;

        try {
            rows = repository.saveObj(user);

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


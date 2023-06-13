package co.edu.sena.java_new_a.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/LOGIN")
public class LoginForwadingServlet extends HttpServlet {
    @Override


    protected  void doGet (HttpServletRequest request , HttpServletResponse response)throws ServletException , IOException
    {
        RequestDispatcher dispatcher= request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request,response);
    }


}
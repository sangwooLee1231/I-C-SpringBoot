package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


// @WebServlet(name = "number", value = "/number")
public class NumberServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String number = req.getParameter("number");
        String number2 = req.getParameter("number2");
        int num = Integer.parseInt(number);
        int num2 = Integer.parseInt(number2);
        int sum = num + num2;
        resp.getWriter().println("sum result >> " + sum);
    }
}


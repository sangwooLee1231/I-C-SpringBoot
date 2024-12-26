package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// @WebServlet(name = "City2", value = "/City2")
public class CityServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String population = req.getParameter("population");
        PrintWriter out = resp.getWriter();

        System.out.println("Get request received");
        out.println("Get request received");


        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter()
                .append("<h1>POST request received</h1>")
                .append("<p>City Name: ").append(name).append("</p>")
                .append("<p>City Population: ").append(population).append("</p>");

        out.println("City Name: "+name);
        out.println("City: "+population);
        System.out.println("City Name: "+name);
        System.out.println("City: "+population);
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String population = req.getParameter("population");

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter()
                .append("<h1>POST request received</h1>")
                .append("<p>City Name: ").append(name).append("</p>")
                .append("<p>City Population: ").append(population).append("</p>");

        out.println("Post request received");
        System.out.println("Post request received");
        out.println("City Name: "+name);
        out.println("City: "+population);
        System.out.println("City Name: "+name);
        System.out.println("City: "+population);
        out.close();
    }


}

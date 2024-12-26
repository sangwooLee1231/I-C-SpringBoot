package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "helloController", value = "/controller")
public class HelloController extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("GET---------------------");
        //http의 body에 넣어서 보내줌.
        resp.getWriter().println("Controller GET -------");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST ---------------------");
        //http의 body에 넣어서 보내줌.
        resp.getWriter().println("Controller POST -------");
    }
}

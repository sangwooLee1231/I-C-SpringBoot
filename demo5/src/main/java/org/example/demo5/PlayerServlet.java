package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "player", value ="/player")
public class PlayerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String score = req.getParameter("Score");
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        System.out.println("Post request received in PlayerServlet");
        out.println("<html><body>");
        out.println("<h1 style='font-size: 24px;'>Post request received in PlayerServlet</h1>"); // 크기와 색상 지정
        out.println("Player Name: " + name + "<br>Player Score: " + score);
        out.println("</body></html>");
    }
}

package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//value속성값이 url임.
//name은 tomcat에 등록되는 서블릿의 이름.
@WebServlet(name = "second", value = "/second")
public class LoginServlet2 extends HttpServlet {

    //http의 method를 추출해서 get요청이 들어오면 doGet()호출
    @Override
    protected void doPost(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost----------------");
        // post 방식은 http의 body에 데이터가 전달되므로
        // 받을 때마다 한글로 인코딩을 해주어야 함.
        // 파라메터 값을 추출하기 전에 한글인코딩을 설정해주어야 함.
        // get 방식은 tomcat의 web.xml 설정에 따라 결정됨.
        // web.xml에 utf-8로 설정함.
        // --> 한글 필터
        // 파라메터를 받기 전에 UTF-8로 인코딩을 먼저 하겠다.
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id"); //나는한글이란다아이디가
        String pw = req.getParameter("pw"); //1234
        System.out.println(id + " " + pw);

        //응답을 보낼 때는 body로 보내기 때문에
        //body마다 인코딩을 설정해주어야 함.
        resp.setContentType("text/html;charset=UTF-8");
        // 문자열들을 http의 body로 넣어서 전송해주는 역할
        // PrintWriter 객체
        PrintWriter out = resp.getWriter();
        out.println(id + " " + pw);
        out.println("<html><body bgcolor=yellow>");
        out.println(id + " "+ pw);
        out.println("</body></html>");
        out.close();
    }
}
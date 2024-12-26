package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//value속성값이 url임.
//name은 tomcat에 등록되는 서블릿의 이름.
// @WebServlet(name = "loginController", value = "/login")
public class LoginServlet extends HttpServlet {

    //http의 method를 추출해서 get요청이 들어오면 doGet()호출
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet----------------");
        //http요청을 받고, http응답을 하는 역할!!
        //login?id=root&pw=1234 (쿼리스트링)
        //요청주소?쿼리스트링 (get방식 --> http header)
        String id = req.getParameter("id"); //root
        String pw = req.getParameter("pw"); //1234

        //Integer.parseInt(); 정수변환
        //Double.parseDouble(); 실수변환
        String result = "";
        if (id.equals("root") && pw.equals("1234")){
            result = "ok";
        }else{
            result = "no";
        }
        //응답
        resp.getWriter().println("Login result >> " + result);
    }
}
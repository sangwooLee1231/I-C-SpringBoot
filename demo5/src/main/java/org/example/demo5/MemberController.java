package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//spring --> @GetMapping("member")
//public void member(){
//    //get요청 url이 member가 처리할 내용!!!
//}

@WebServlet(name = "member", value = "/member")
public class MemberController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("get request ---------");
        //http의 body에 넣어서 보내줌.
        //1. 클라이언트가 전송한 데이터를 받자.(req)
        //서버가 전달받은 데이터의 타입은 무조건 String
        String id = req.getParameter("id"); //id=root
        String pw = req.getParameter("pw"); //pw=1234
        String name = req.getParameter("name"); //name=park
        String tel = req.getParameter("tel"); //tel=011
        System.out.println(id + " " + pw + " " + name + " " + tel);
        //2. 서버가 데이터를 클라이언트에게 확인하도록 전송해주자.(resp)
        resp.getWriter().println(id + " " + pw + " " + name + " " + tel);
    }


}

package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout.do")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //세션 끊고, 세션으로 설정한 값 모두 지우자.!!
        //세션 객체 먼저 획득 후, 세션 끊기
        HttpSession session = req.getSession();
        session.invalidate();//세션끊기
        //session.removeAttribute("loginId");
        //화면을 loginSession.jsp로 넘기자.
        //클라이인트에게 loginSession.jsp를 호출하라고 명령해서 넘기자.
        resp.sendRedirect("loginSession.jsp");
        //새로운 request/response객체 생성됨.
    }
}
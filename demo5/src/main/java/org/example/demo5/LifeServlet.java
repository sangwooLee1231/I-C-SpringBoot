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

@WebServlet(name = "life", value = "/life")
public class LifeServlet extends HttpServlet {

//     생성자를 하나도 안쓰면 기본생성자가 만들어짐
//     서블릿은 최초 호출시에 객체가 생성되어 메모리에 준비됨.(loading)
//     게으른 로딩(Lazy Loading)
    public LifeServlet() {
        System.out.println("Life Servlet 객체 생성");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get 요청");
        System.out.println("service()에서 method판단 ----> doGet 호출");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post 요청");
        System.out.println("service()에서 method판단 ----> doPost 호출");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("서블릿 초기화");
        System.out.println("ex) db연결 등");

    }

    @Override
    public void destroy() {
        System.out.println("서블릿 소멸");
        // db연결 객체등의 자원 해제
        // 서블릿 종료되었을 때 언제, 무슨 이유로... 기록
    }
}

package org.example.demo5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberController2 {


    // 클라이언트 요청 하나당 컨트롤러 함수 하나!
    // insert() 회원가입 기능
    public void insert(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("회원가입 컨트롤 요청");
        // view를 따로 파일로 만들어서
        // view파일을 불러서 응답하게 하자.
        // view파일을 설정
        // jsp를 서버가 부를 때 forward를 씀.
        // forward할때 req, res객체를 함께 전달!
        // jsp는 서블릿으로 변환되는데 service(req, res) 안으로 
        // jsp자바코드가 다 들어감.
        // forwad로 jsp를 호출할 때 service(req,res) 호출함.
        // 입력값을 req, res필요!
        // forward할 떄 req, res를 전달함.
        // jsp로 컨트롤러에서 결과를 전달할 값은 request의 속성으로 설정함.
        // forward로 전달할 때 이 속성도 함께 전달됨.
        req.setAttribute("result","회원 가입 성공함!");
        RequestDispatcher rd =
                req.getRequestDispatcher("views/member_result.jsp");
        // view파일로 설정한 파일을 불러주는 부분!
        // 컨트롤러에서 처리한 결과를 jsp에 넣어서 응답할 떄
        // --> forward
        // 회원가입을 하고 결과를 "회원가입 성공했습니다(jsp)" 보내고 싶음.
        rd.forward(req,res); // 서버의 컨트롤러가 불렀음
        // 새로운 컨트롤러에서 처리한 결과를 보낼 필요가 없고 새로운 요청을 하라고 할 때
        // --> redirect
        // 회원가입 성공적으로 처리 --> 다음 작업은 로그인 화면을 요청
        // forward() <---> redirect("/") 서버가 클라이언트에게 호출하도록 명령하는 함수
    }

    // delete() 회원탈퇴 기능
    public void delete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("회원탈퇴 컨트롤 요청");

        req.setAttribute("result","회원 탈퇴 성공함!");
        RequestDispatcher rd =
                req.getRequestDispatcher("views/member_result.jsp");
        rd.forward(req,res);
    }
}

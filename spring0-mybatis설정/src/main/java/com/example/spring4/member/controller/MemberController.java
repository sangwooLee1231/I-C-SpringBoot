package com.example.spring4.member.controller;

import com.example.spring4.member.vo.MemberVO;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤객체생성 + 아래에 나온 주소와 함수를 스프링에 등록
@RequestMapping("member") //contextpath/member
@RequiredArgsConstructor //@Autowired
//멤버변수 @Autowired로 주입해줄 것을 모두 찾아서 넣어줌.
//@Slf4j //기본으로 지정된 클래스를 써줘(log-back 사용)
@Log4j2 //Slf4j표준에 따라서 만든 클래스인 Log4j를 써줘!
public class MemberController {


    @GetMapping("create") //contextpath/member/create
    public String create() {
        log.info(">>>>>>> 화면 요청 로그기록 >>>>>>>>>");
        System.out.println("create 화면 요청>>>>>>>>>>>>>>>> ");
        return "member/create";
    }

    @PostMapping("create2")
    public String create2(MemberVO memberVO) {

        return "member/member";
    }

    @GetMapping("member") //contextpath/member/member
    public String member() {
        System.out.println("member 화면 요청>>>>>>>>>>>>>>>> ");
        return "member/member";
    }

    @PostMapping("login")
    public String login(MemberVO memberVO,
                        HttpSession session,
                        Model model) {
      return "member/member"; //로그인 페이지!
    }

    @GetMapping("logout") //컨텍스트패스/member/logout
    public String logout(HttpSession session) {

        return "member/member";
    }

    @PostMapping("read")
    public String read(String id, Model model) { //<input name="id"

        return "member/read";
    }

    @GetMapping("delete")
    public String delete(String id, HttpSession session) {
        return null;
    }

    @GetMapping("update") //수정 화면 요청
    public String update(String id, Model model) {
        System.out.println("member id >>>>>>>>>>>>> " + id);
        return "member/update";
    }

    @PostMapping("update2") //수정 처리 요청
    public String update2(MemberVO memberVO) {
        return null;
    }
}

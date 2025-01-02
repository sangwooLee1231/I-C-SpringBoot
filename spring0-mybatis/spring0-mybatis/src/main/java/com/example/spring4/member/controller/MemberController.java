package com.example.spring4.member.controller;

import com.example.spring4.member.service.MemberService;
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

    private final MemberService memberService;

    @GetMapping("create") //contextpath/member/create
    public String create() {
        log.info(">>>>>>> 회원가입 화면 요청 로그 기록 >>>>>>>>>");
        System.out.println("create 화면 요청 >>>>>>>>> ");

        return "member/create";
    }

    @PostMapping("create2")
    public String create2(MemberVO memberVO) {
        log.info("회원가입 로그 기록 >>>>>>>>> " + memberVO);
        System.out.println("회원가입 정보 >>>>>>>>> " + memberVO);

        int result = memberService.insertMember(memberVO);

        if(result > 0){
            return "member/member";
        }else{
            return "error/error";
        }


    }

    @GetMapping("member") //contextpath/member/member
    public String member() {
        log.info("로그인 화면 요청 로그 기록 >>>>>>>>>");
        System.out.println("member 화면 요청 >>>>>>>>>");
        
        return "member/member";
    }

    @PostMapping("login")
    public String login(MemberVO memberVO,
                        HttpSession session,
                        Model model) {
        log.info("로그인 정보 요청 기록 >>>>>>>>> " + memberVO);
        System.out.println("로그인 정보 >>>>>>>>> " + memberVO);

        boolean result = memberService.selectMemberById(memberVO);

        if(result){
            session.setAttribute("id", memberVO.getId());
        }else{
            model.addAttribute("result","로그인 실패 했습니다.");
        }

        return "member/member"; //로그인 페이지!

    }

    @GetMapping("logout") //컨텍스트패스/member/logout
    public String logout(HttpSession session) {
        log.info("로그아웃 로그 기록 >>>>>>>>>");
        System.out.println("로그아웃 >>>>>>>>>");

        session.invalidate();
        return "member/member";
    }

    @PostMapping("read")
    public String read(String id, Model model) { //<input name="id"
        log.info("사용자 정보 화면 요청 로그 기록 >>>>>>>>> " + id);
        System.out.println("사용자 정보(id) >>>>>>>>> " + id);

        MemberVO memberVO = memberService.selectMemberById(id);
        model.addAttribute("memberVO", memberVO);
        return "member/read";
    }

    @GetMapping("delete")
    public String delete(String id, HttpSession session) {
        session.invalidate();
        log.info("회원 탈퇴 로그 기록 >>>>>>>>> " + id);
        System.out.println("회원 탈퇴 정보(id) >>>>>>>>> " + id);

        int result = memberService.deleteMember(id);

        if(result > 0){
            return "member/member";
        }else{
            return "error/error";
        }
    }

    @GetMapping("update") //수정 화면 요청
    public String update(String id, Model model) {
        log.info("회원 정보 수정 화면 요청 로그 기록 ");
        System.out.println("회원 정보 수정 화면");

        MemberVO memberVO = memberService.selectMemberById(id);
        model.addAttribute("memberVO", memberVO);
        return "member/update";
    }

    @PostMapping("update2") //수정 처리 요청
    public String update2(MemberVO memberVO) {
        log.info("회원 정보 수정 처리 요청 >>>>>>>>> " + memberVO);
        System.out.println("수정된 회원 정보 >>>>>>>>> " + memberVO);

        int result = memberService.updateMember(memberVO);
        if(result > 0){
            return "member/member";
        }else{
            return "error/error";
        }
    }
}

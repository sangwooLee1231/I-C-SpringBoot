package com.example.spring5.member.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 싱글톤 객체 생성 + 아래에 나온 주소와 함수를 스프링에 등록
@RequestMapping("member") //contextpath/member
public class MemberController {

    @GetMapping("create") // contextpath/member/create
    public String create() {
        System.out.println("create 화면 요청");
        return "member/create";
    }

}

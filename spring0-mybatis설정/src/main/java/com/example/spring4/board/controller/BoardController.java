package com.example.spring4.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤객체생성 + 아래에 나온 주소와 함수를 스프링에 등록
@RequestMapping("board") //contextpath/board
public class BoardController {

    @GetMapping("board") //contextpath/board/board
    public String board() {
        System.out.println("board 화면 요청>>>>>>>>>>>>>>>> ");
        return "board/board";
    }
}

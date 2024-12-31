package org.example.spring4.member.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j // logback 객체가 생성
// Slf4j log = new LogBack();
@Controller
@RequestMapping("board")
// localhost:8888/member
@RequiredArgsConstructor
public class BoardController {


    @GetMapping("board")
    // localhost:8888/board/board
    public String board(){
        log.info("board----------");
        return "board/board";
        //templates아래 member 폴더를 찾고
        // member폴더/member.html을 찾습니다.
    }

    @GetMapping("create")
    // localhost:8888/board/create
    public String create() {
        log.info("create 요청됨.");
        return "board/create";
    }

}

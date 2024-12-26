package org.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @GetMapping("catePost")
    public String catePost() {
        System.out.println("게시판 글쓰기");
        return "catePost";
    }

    @GetMapping("deletePost")
    public String deletePost() {
        System.out.println("게시판 글삭제");
        return "deletePost";
    }

    @GetMapping("editPost")
    public String editPost() {
        System.out.println("게시판 글수정");
        return "editPost";
    }

    @PostMapping("viewPost")
    public String catePost(int no) {
        System.out.println("게시판 글보기 " + no);
        return "viewPost";
    }
}

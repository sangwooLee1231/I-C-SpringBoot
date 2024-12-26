package org.example.spring2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class BoardController {
    @GetMapping("createPost")
    public String create(){
        return "createPost";
    }
    @PostMapping("createPost2")
    public String create2(BoardVO boardVO, Model model){
        model.addAttribute("boardVO", boardVO);
        return "createPost2";
    }
    @GetMapping("deletePost")
    public String delete(){
        return "delete";
    }
    @PostMapping("viewPost")
    public String create(int no, Model model){
        return "read";
    }
    @GetMapping("editPost")
    public String update(){
        return "redirect:/"; //첫페이지를 클라이언트가 호출하도록 함.
        //return "update";
    }
    @PostMapping("editPost2")
    public String update2(BoardVO boardVO, Model model){
        model.addAttribute("boardVO", boardVO);
        return "editPost2";
    }
}


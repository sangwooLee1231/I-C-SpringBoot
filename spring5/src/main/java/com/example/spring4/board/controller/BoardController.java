package com.example.spring4.board.controller;

import com.example.spring4.board.service.BoardService;
import com.example.spring4.board.vo.BoardVO;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller //싱글톤객체생성 + 아래에 나온 주소와 함수를 스프링에 등록
@RequestMapping("board") //contextpath/board
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;
    private com.example.spring4.board.vo.BoardVO BoardVO;

    @GetMapping("board") //contextpath/board/board
    public String board(Model model) {
        System.out.println("board 화면 요청>>>>>>>>>>>>>>>> ");
        List<BoardVO> list = boardService.selectBoardAll();
        System.out.println("list.size() " + list.size());
        System.out.println("-------------list--------");
        System.out.println(list);
        model.addAttribute("list", list);
        // model은 templetes파일까지 list데이터 전달(주소가 전달)
        return "board/board"; // templetes/board/board.html을 호출
    }

    @GetMapping("create")
    public String create() {
        return "board/create";
    }

    @PostMapping("create2")
    public String create2(BoardVO boardVO) {
       int result = boardService.insertBoard(boardVO); // result를 예외처리 하기위해 생성
        if(result >0) {
            return "redirect:/board/board";
        } else {
            return "/error/error";
        }

    }

    @GetMapping("read")
    public String read(int no, Model model) {
        BoardVO BoardVO = boardService.selectBoardByNo(no);
        model.addAttribute("boardVO", BoardVO);
        return "board/read";
    }

    @GetMapping("update")
    public String update(int no,Model model) {
        BoardVO BoardVO = boardService.selectBoardByNo(no);
        model.addAttribute("boardVO", BoardVO);

        return "board/update";

    }

    @PostMapping("update2")
    public String update2(BoardVO boardVO) {
        System.out.println(boardVO); //
        int result = boardService.updateBoard(boardVO);
        System.out.println("result " + result);
        if(result > 0) {
            return "/board/update2";
        } else {
            return "/error/error";
        }
    }

    @GetMapping("delete")
    public String delete(int no) {
        int result = boardService.deleteBoard(no);
        if(result >0) {
            return "redirect:/board/board";
        } else {
            return "/error/error";
        }
    }






}

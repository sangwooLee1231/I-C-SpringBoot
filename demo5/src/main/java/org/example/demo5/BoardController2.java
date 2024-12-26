package org.example.demo5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardController2 {

    // 클라이언트 요청 하나당 컨트롤러 함수 하나!
    // insert() 게시판 글쓰기 기능
    public void insert(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("게시판 글쓰기 컨트롤 요청");

        req.setAttribute("result","게시판 글쓰기 성공함!");
        RequestDispatcher rd =
                req.getRequestDispatcher("/views/board_result.jsp");
        rd.forward(req,res);
    }

    // delete() 게시판 글삭제 기능
    public void delete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("게시판 글삭제 컨트롤 요청");

        req.setAttribute("result","게시판 글삭제 성공함!");
        RequestDispatcher rd =
                req.getRequestDispatcher("/views/board_result.jsp");
        rd.forward(req,res);
    }
}

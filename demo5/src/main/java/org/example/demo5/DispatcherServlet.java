package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


// 모든 요청을 다 받을 때
@WebServlet("/") //localhost:8888 이후에 들어가는 시작점 /member_insert(http의 header에 들어가있음)
public class DispatcherServlet extends HttpServlet {
    MemberController2 memberController = new MemberController2();
    BoardController2 boardController = new BoardController2();
    ProductController productController = new ProductController();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 모든 요청을 이 메서드가 받음
        // 주소 추출해서 해당 컨트롤러의 메서드를 호출하자
        String uri = req.getRequestURI(); // member_insert
        System.out.println("uri>>>>" + uri);

        if(uri.equals("/member_insert")) {
            memberController.insert(req,resp);
        }
        else if(uri.equals("/board_insert")) {
            boardController.insert(req,resp);
        }
        else if(uri.equals("/member_delete")) {
            memberController.delete(req,resp);
        }
        else if(uri.equals("/board_delete")) {
            boardController.delete(req,resp);
        }
        else if(uri.equals("/product_insert")) {
            productController.insert(req,resp);
        }
        else if(uri.equals("/product_delete")) {
            productController.delete(req,resp);
        }

    }
}

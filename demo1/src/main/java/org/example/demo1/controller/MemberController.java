package org.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // 스프링에 컨트롤러로 등록
// method + url을 and조건으로 체크하여 함수를 호출
public class MemberController {

    // 함수 4개
    // get요청 3개

    @GetMapping("create")
    public String create() {
        System.out.println("create 호출");
        return "create";
    }
    @GetMapping("delete")
    public String delete() {
        System.out.println("delete 호출");
        return "delete";
    }
    @GetMapping("update")
    public String update() {
        System.out.println("update 호출");
        return "update";
    }
    @PostMapping("read")
    public String read(int id) {
        // <input type = "number" id="id" name="id" value="100">
        // id = 100
        // String id = request.getParameter("id");
        // int id2 = Integer.parserInt(id);
        System.out.println("read 호출" + id);
        return "read";
    }

}

package org.example.spring4.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller //싱글톤 + 컨트롤러로 등록
//여기서 쓴 주소와 함수명을 스프링에 등록
public class HomeController {

    @GetMapping("/")
    public String index() {
        log.info("index-------------------");
        return "index";
    }
}
package org.example.spring2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LeafController {

    @GetMapping("leaf")
    public String leaf(Model model) {
        System.out.println("left--------------------");
        List<String> list = new ArrayList<>();
        list.add("hong");
        list.add("kim");

        int age = 15;
        String userid = "root";

        model.addAttribute("title","타임리프 테스트");
        model.addAttribute("age",age);
        model.addAttribute("userid",userid);
        model.addAttribute("list",list);

        return "leaf";
    }
}

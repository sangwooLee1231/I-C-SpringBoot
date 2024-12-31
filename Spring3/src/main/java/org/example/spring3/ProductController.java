package org.example.spring3;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {


    @GetMapping("product")
    public String Product() {



        return "product";
    }


    @PostMapping("product2")
    public String Product2(ProductVO productVO, Model model) {

        model.addAttribute("product", productVO);

        return "product2";
    }

    @GetMapping("product3")
    public String Product3() {

        return "product3";
    }

    @PostMapping("product4")
    public String Product4(ProductVO productVO, Model model) {

        model.addAttribute("product", productVO);

        return "product4";
    }


}

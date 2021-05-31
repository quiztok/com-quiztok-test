package com.quiztok.comquiztoktest.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping
    public String index(Model model) {
        model.addAttribute("name", "SpringBlog from Millky");
        return "hello";
    }
}

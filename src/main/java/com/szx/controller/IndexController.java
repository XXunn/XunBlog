package com.szx.controller;

import com.szx.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    // 主页controller
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/BlogInput")
    public String BlogInput() {
        return "admin/blogs-input";
    }

    @GetMapping("/login")
    public String BlogLogin() {
        return "login";
    }


//    @GetMapping("/{id}/{name}")
//    public String index(@PathVariable Integer id,@PathVariable String name) {
//        System.out.println("-----------index-----------");
//        return "index";
//    }

}

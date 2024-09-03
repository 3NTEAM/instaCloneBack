package com.n.instaClone.users.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/user")
    public String UserMain() {
        return "client/main";
    }

    @GetMapping("/login")
    public String login(){
        return "client/login";
    }

    @GetMapping("/signUp")
    public String signup() {
        return "client/signUp";
    }
}

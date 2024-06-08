package com.n.instaClone.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(LoginController.PATH)
public class LoginController {

    static final String PATH = "/login";


    //    @PostMapping
//    public String createAccount() {
//        return "client/signUp";
//    }
}

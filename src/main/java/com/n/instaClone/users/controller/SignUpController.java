package com.n.instaClone.users.controller;

import com.n.instaClone.users.domain.dto.MemberDto;
import com.n.instaClone.users.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signUp")
public class SignUpController {


    private final UserService userService;

    public SignUpController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String createAccount(Model model) {
        model.addAttribute("signUpForm", new MemberDto());
        return "client/signUp";
    }

    @PostMapping
    public String createAccount(@ModelAttribute(name = "signUpForm") MemberDto memberDto) {
        userService.createAccount(memberDto);
        return "redirect:/";
    }
}

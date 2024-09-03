package com.n.instaClone.users.controller;

import com.n.instaClone.users.domain.dto.MemberDto;
import com.n.instaClone.users.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/temp")
public class SignUpController {


    private final UserService userService;

    public SignUpController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public String createAccount(MemberDto memberDto) {
        userService.createAccount(memberDto);

        return "redirect:/";
    }
}

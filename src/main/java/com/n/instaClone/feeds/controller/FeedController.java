package com.n.instaClone.feeds.controller;

import com.n.instaClone.feeds.domain.model.Feed;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/feed")
public class FeedController {
    //개인 피드
    @GetMapping
    public String feed(Model model){
        //서비스 호출에서 모델에 넘기기
        Feed feeds = null;
        model.addAttribute("feed", feeds);
        return "feed/feed";
    }
}

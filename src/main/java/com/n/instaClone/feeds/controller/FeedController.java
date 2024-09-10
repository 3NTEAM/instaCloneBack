package com.n.instaClone.feeds.controller;

import com.n.instaClone.feeds.domain.dto.FeedDto;
import com.n.instaClone.feeds.domain.model.Feed;
import com.n.instaClone.feeds.service.FeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/feed")
@RequiredArgsConstructor
public class FeedController {
    private final FeedService feedService;

    /**
     * 전체 피드 화면
     * @author hyunSu
     * @param model thymeleaf 로 던질 모델
     * @return 전체 피드화면 페이지
     */
    @GetMapping("/getAllFeed")
    public String getAllFeed(Model model){
        List<Feed> feeds = feedService.findAll();
        model.addAttribute("feeds", feeds);

        return "feed/feed";
    }

    /**
     * 피드 상세 화면 가져오기
     * @author hyunSu
     * @param feedId 피드 아이디
     * @param model thymeleaf 로 던질 모델
     * @return 피드 상세 화면 페이지
     */
    @GetMapping("/getFeedDetail")
    public String getFeedDetail(@RequestParam Long feedId,
                             Model model){
        Optional<Feed> feed = feedService.findById(feedId);
        if(feed.isPresent()) model.addAttribute("feed", feed);
        else model.addAttribute("feed", new Feed());

        return "feed/feedDetail";
    }

    /**
     * 피드 저장하기
     * @author hyunsu
     * @param feed 피드 데이터
     * @return 응답 상태
     */
    @PostMapping("/getFeedDetail")
    public ResponseEntity<Feed> createFeed(@ModelAttribute(name = "feed") Feed feed){
        Feed newFeed = feedService.createFeed(feed);
        return ResponseEntity.status(HttpStatus.CREATED).body(newFeed);
    }

    @PostMapping("/createFeedLike")
    public void createFeedLike(@RequestParam Long feedId){
        //좋아요 추가

    }

    @PostMapping("/deleteFeedLike")
    public void deleteFeedLike(@RequestParam Long feedId){
        //좋아요 취소
    }

    @PostMapping("/createFeedComment")
    public void createFeedComment(){
        //피드 코멘트 추가 dto 새로 생성
    }
}

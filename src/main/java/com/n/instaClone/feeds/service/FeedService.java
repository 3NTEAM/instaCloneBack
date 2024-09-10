package com.n.instaClone.feeds.service;

import com.n.instaClone.feeds.domain.dto.FeedDto;
import com.n.instaClone.feeds.domain.model.Feed;
import com.n.instaClone.feeds.domain.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Comparator;

@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedRepository feedRepository;

    /**
     * 전체 피드 목록 가져오기
     * @author hyunSu
     * @return 전체 피드 목록
     */
    public List<Feed> findAll(){
        List<Feed> feeds = feedRepository.findAll();
        feeds.sort(Comparator.comparing(Feed::getCreateDate).reversed());
        return feeds;
    }

    /**
     * 피드 상세 가져오기
     * 좋아요, 댓글 까지 같이 가져오게 수정 필요
     * @author hyunSu
     * @param id 피드 아이디
     * @return 파드 상세 정보
     */
    public Optional<Feed> findById(Long id){
        return feedRepository.findById(id);
    }

    /**
     * 자기 피드 목록 가져오기
     * @author hyunSu
     * @param userId 사용자 아이디
     * @return 자신 피드 목록
     */
    public List<Feed> findByUserId(Long userId){
        List<Feed> feeds = feedRepository.findByUserId(userId);
        feeds.sort(Comparator.comparing(Feed::getCreateDate).reversed());
        return feeds;
    }

    /**
     * 피드 저장하기
     * @author hyunsu
     * @param feed feed 데이터
     */
    public Feed createFeed(Feed feed){
        //Feed newFeed = feed.toEntity();
        return feedRepository.save(feed);
    }

}

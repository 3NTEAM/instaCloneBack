package com.n.instaClone.feeds.domain.repository;

import com.n.instaClone.feeds.domain.model.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedRepository  extends JpaRepository<Feed, Long> {
    List<Feed> findByUserId(Long userId);
}

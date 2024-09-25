package com.n.instaClone.feeds.domain.repository;

import com.n.instaClone.feeds.domain.model.LikeFeed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeFeedRepository extends JpaRepository<LikeFeed, Long> {

}

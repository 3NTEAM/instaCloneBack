package com.n.instaClone.feeds.service;

import com.n.instaClone.feeds.domain.repository.LikeFeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LikeFeedService {

    private final LikeFeedRepository likeFeedRepository;
}

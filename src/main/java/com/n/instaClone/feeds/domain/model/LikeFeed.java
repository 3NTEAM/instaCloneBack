package com.n.instaClone.feeds.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
public class LikeFeed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeFeedId;
    private Long userId;
    private Long feedId;
    @CreationTimestamp
    private Timestamp createDate;
}

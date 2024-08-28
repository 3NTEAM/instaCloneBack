package com.n.instaClone.feeds.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "feed")
public class Feed {
    @Id
    Long id;
}

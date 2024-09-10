package com.n.instaClone.feeds.domain.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Timestamp;

@Entity
@Table(name = "feed")
@NoArgsConstructor
@Getter
public class Feed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String imagePath;
    private String feedText;
    @CreationTimestamp
    private Timestamp createDate;
    @UpdateTimestamp
    private  Timestamp updateDate;

    @Builder
    public Feed(String _imagePath, String _feedText){
        this.imagePath = _imagePath;
        this.feedText = _feedText;
    }

}

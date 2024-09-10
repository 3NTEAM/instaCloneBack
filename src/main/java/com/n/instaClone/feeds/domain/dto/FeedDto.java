package com.n.instaClone.feeds.domain.dto;

import com.n.instaClone.feeds.domain.model.Feed;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;


@Getter
public class FeedDto {

    private MultipartFile feedImage;
    private String imagePath;
    private String feedText;

    public Feed toEntity() {
        return Feed.builder()
                ._imagePath(this.imagePath)
                ._feedText(this.feedText)
                .build();
    }

}

package com.example.ch4_1_newsfeed.dto.feed.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public class FindAllFeedResponseDto {
    private Long feed_id;
    private Long following_id;
    private String contents;
    private LocalDateTime createdAt;
    private List<String> photos;

    public FindAllFeedResponseDto(Long feedId, Long userId, String content, LocalDateTime createdAt, String photoUrls) {
        this.feed_id = feedId;
        this.following_id = userId;
        this.contents = content;
        this.createdAt = createdAt;
        this.photos = Arrays.asList(photoUrls.split(",")); // 문자열을 List로 변환
    }

}

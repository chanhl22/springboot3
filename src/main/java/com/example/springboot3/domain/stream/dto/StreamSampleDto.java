package com.example.springboot3.domain.stream.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class StreamSampleDto {

    private String content;

    @Builder
    private StreamSampleDto(String content) {
        this.content = content;
    }

    public static StreamSampleDto of(String content) {
        return StreamSampleDto.builder().content(content).build();
    }

    public void updateContent(String content) {
        this.content = content;
    }

    public StreamSampleDto updateContentAndReturn(String content) {
        this.content = content;
        return this;
    }

}

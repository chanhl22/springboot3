package com.example.springboot3.domain.extend.answer.type;

import com.example.springboot3.domain.extend.answer.Answer;
import com.example.springboot3.domain.extend.attach.Attach;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnswerMultiple extends Answer {

    @Comment("기타 옵션 추가 여부")
    @Column(nullable = false)
    private Boolean isEtc;

    @Comment("응답 옵션 내용")
    private String content;

    @Comment("첨부한 이미지")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_id")
    private Attach image;

}

package com.example.springboot3.domain.extend.answer.type;

import com.example.springboot3.domain.extend.answer.Answer;
import com.example.springboot3.domain.extend.answer.enumeration.AnswerType;
import com.example.springboot3.domain.extend.attach.Attach;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnswerSingle extends Answer {

    @Comment("기타 옵션 추가 여부")
    @Column(nullable = false)
    private Boolean isEtc;

    @Comment("응답 옵션 내용")
    private String content;

    @Comment("첨부한 이미지")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_id")
    private Attach image;

    @Builder
    private AnswerSingle(AnswerType answerType, Boolean isEtc, String content, Attach image) {
        this.answerType = answerType;
        this.isEtc = isEtc;
        this.content = content;
        this.image = image;
    }

    public static AnswerSingle create(AnswerType answerType, Boolean isEtc, String content, Attach image) {
        return AnswerSingle.builder()
                .answerType(answerType)
                .isEtc(isEtc)
                .content(content)
                .image(image)
                .build();
    }

}

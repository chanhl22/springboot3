package com.example.springboot3.domain.extend.answer.type;

import com.example.springboot3.domain.extend.answer.Answer;
import com.example.springboot3.domain.extend.answer.enumeration.AnswerGridType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnswerGrid extends Answer {

    @Comment("표 형식의 행/열 기준")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AnswerGridType answerGridType;

    @Comment("응답 옵션 내용")
    @Column(nullable = false)
    private String content;

}

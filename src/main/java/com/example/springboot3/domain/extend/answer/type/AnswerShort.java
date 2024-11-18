package com.example.springboot3.domain.extend.answer.type;

import com.example.springboot3.domain.extend.answer.Answer;
import com.example.springboot3.domain.extend.answer.enumeration.AnswerType;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnswerShort extends Answer {

    @Builder
    private AnswerShort(AnswerType answerType) {
        this.answerType = answerType;
    }

    public static AnswerShort create(AnswerType answerType) {
        return AnswerShort.builder()
                .answerType(answerType)
                .build();
    }

}

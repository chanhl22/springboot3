package com.example.springboot3.domain.extend.answer.type;

import com.example.springboot3.domain.extend.answer.Answer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnswerDropdown extends Answer {

    @Comment("응답 옵션 내용")
    @Column(nullable = false)
    private String content;

}

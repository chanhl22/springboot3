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
public class AnswerLinear extends Answer {

    @Comment("최소 범위")
    @Column(nullable = false)
    private Integer min;

    @Comment("최소 범위 라벨")
    @Column(nullable = false)
    private String minLabel;

    @Comment("최대 범위")
    @Column(nullable = false)
    private Integer max;

    @Comment("최대 범위 라벨")
    @Column(nullable = false)
    private String maxLabel;

}

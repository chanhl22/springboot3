package com.example.springboot3.domain.extend.answer;

import com.example.springboot3.domain.extend.answer.enumeration.AnswerType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import lombok.Getter;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

import static jakarta.persistence.InheritanceType.JOINED;

@Entity
@Getter
@Inheritance(strategy = JOINED)
@DiscriminatorColumn
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long answerId;

    @Comment("옵션 타입")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    protected AnswerType answerType;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    protected LocalDateTime createDt;

    @UpdateTimestamp
    @Column(insertable = false)
    protected LocalDateTime updateDt;

}

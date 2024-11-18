package com.example.springboot3.domain.extend.answer.type;

import com.example.springboot3.domain.extend.answer.Answer;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnswerLong extends Answer {
}

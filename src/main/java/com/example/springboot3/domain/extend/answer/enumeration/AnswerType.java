package com.example.springboot3.domain.extend.answer.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AnswerType {

    SINGLE("단일 응답"),
    MULTIPLE("복수 응답"),
    SHORT("단답형 응답"),
    LONG("장문형 응답"),
    LINEAR("선형 배율"),
    GRID("표 형식"),
    DROPDOWN("드롭 다운"),
    RANK("순위별 응답");

    private final String value;

}

package com.example.springboot3.domain.extend.answer.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AnswerGridType {

    ROW("행", "질문으로 사용하는 Answer"),
    COLUMN("열", "응답으로 사용하는 Answer");

    private final String value;
    private final String description;

    public static boolean isRow(AnswerGridType type) {
        return type == ROW;
    }

    public static boolean isColumn(AnswerGridType type) {
        return type == COLUMN;
    }

}
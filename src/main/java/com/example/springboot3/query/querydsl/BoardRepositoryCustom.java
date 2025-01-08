package com.example.springboot3.query.querydsl;

import java.util.List;

public interface BoardRepositoryCustom {

    List<Board> searchOr(String word);

    List<Board> searchAnd(String word);

    List<Board> searchAndDirect(String word);

}

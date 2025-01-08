package com.example.springboot3.query.querydsl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @DisplayName("where 절로 데이터를 검색한다.")
    @Test
    void updateContentToUpperCaseBad() {
        //given
        boardRepository.save(new Board("시니컬한 복숭아"));
        boardRepository.save(new Board("시니컬한 사과"));
        boardRepository.save(new Board("행복한 수박"));
        boardRepository.save(new Board("피곤한 참외"));

        //when
        List<Board> result1 = boardRepository.searchAnd("시니컬한 사과");
        List<Board> result2 = boardRepository.searchOr("시니컬한 사과");

        //then
        assertThat(result1).hasSize(1);
        assertThat(result2).hasSize(2);
    }

    @DisplayName("where 절을 여러개 사용하는 경우 and로 결합된다.")
    @Test
    void queryWhereAnd() {
        //given
        boardRepository.save(new Board("시니컬한 복숭아"));
        boardRepository.save(new Board("시니컬한 사과"));
        boardRepository.save(new Board("행복한 수박"));
        boardRepository.save(new Board("피곤한 참외"));

        //when
        List<Board> result1 = boardRepository.searchAnd("시니컬한 사과");
        List<Board> result2 = boardRepository.searchAndDirect("시니컬한 사과");

        //then
        assertThat(result1).hasSize(1);
        assertThat(result2).hasSize(1);
    }

}
package com.example.springboot3.query.querydsl;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import io.micrometer.common.util.StringUtils;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

import static com.example.springboot3.query.querydsl.QBoard.board;

@Repository
public class BoardRepositoryImpl implements BoardRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public BoardRepositoryImpl(EntityManager em) {
        queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<Board> searchOr(String word) {
        return queryFactory
                .selectFrom(board)
                .where(searchConditionOr(word))
                .fetch();
    }

    private BooleanExpression searchConditionOr(String word) {
        List<String> splitWords = Arrays.stream(word.split("\\s+"))
                .toList();

        if (StringUtils.isBlank(word)) {
            return null;
        }

        return splitWords.stream()
                .map(board.content::containsIgnoreCase)
                .reduce(BooleanExpression::or)
                .orElse(null);
    }

    @Override
    public List<Board> searchAnd(String word) {
        JPAQuery<Board> query = queryFactory
                .selectFrom(board);

        searchConditionAnd(word, query);

        return query.fetch();
    }

    @Override
    public List<Board> searchAndDirect(String word) {
        List<String> splitWords = Arrays.stream(word.split("\\s+"))
                .toList();

        return queryFactory
                .selectFrom(board)
                .where(board.content.containsIgnoreCase(splitWords.get(0)))
                .where(board.content.containsIgnoreCase(splitWords.get(1)))
                .fetch();
    }

    private void searchConditionAnd(String word, JPAQuery<Board> query) {
        if (StringUtils.isBlank(word)) {
            return;
        }

        List<String> splitWords = Arrays.stream(word.split("\\s+"))
                .toList();

        splitWords.forEach(splitWord ->
                query.where(
                        board.content.containsIgnoreCase(splitWord)
                )
        );
    }

}

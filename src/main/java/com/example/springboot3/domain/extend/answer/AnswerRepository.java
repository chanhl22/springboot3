package com.example.springboot3.domain.extend.answer;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

    @EntityGraph(attributePaths = {"image"})
    List<Answer> findWithImageByAnswerIdIn(List<Long> answerId);

}

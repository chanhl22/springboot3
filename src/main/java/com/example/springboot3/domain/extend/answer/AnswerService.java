package com.example.springboot3.domain.extend.answer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    public List<Answer> findAnswers(List<Long> answerIds) {
        return answerRepository.findWithImageByAnswerIdIn(answerIds);
    }

}

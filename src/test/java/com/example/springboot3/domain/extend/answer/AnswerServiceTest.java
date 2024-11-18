package com.example.springboot3.domain.extend.answer;

import com.example.springboot3.domain.extend.answer.enumeration.AnswerType;
import com.example.springboot3.domain.extend.answer.type.AnswerShort;
import com.example.springboot3.domain.extend.answer.type.AnswerSingle;
import com.example.springboot3.domain.extend.attach.Attach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
class AnswerServiceTest {

    @Autowired
    private AnswerService answerService;

    @Autowired
    private AnswerRepository answerRepository;

    @DisplayName("answer와 image를 같이 조회한다.")
    @Test
    void saveFail() {
        //given
        Attach attach = Attach.create("테스트 파일", "www.test.com", "realTestPath");
        AnswerSingle answerSingle = AnswerSingle.create(AnswerType.SINGLE, false, "단일응답", attach);
        AnswerShort answerShort = AnswerShort.create(AnswerType.SHORT);
        answerRepository.save(answerSingle);
        answerRepository.save(answerShort);

        //when
        //todo 상속일 경우 패치조인은 불가능한가?
        List<Answer> result = answerService.findAnswers(List.of(answerSingle.getAnswerId(), answerShort.getAnswerId()));

        //then
        assertThat(result).hasSize(2)
                .extracting("image")
                .containsExactly(attach, null);
    }

}
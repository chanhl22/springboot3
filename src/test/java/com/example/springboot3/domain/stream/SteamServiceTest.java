package com.example.springboot3.domain.stream;

import com.example.springboot3.domain.stream.dto.StreamSampleDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SteamServiceTest {

    @Autowired
    private StreamService streamService;

    @DisplayName("결과를 대문자로 변경한다.")
    @Test
    void updateContentToUpperCaseBad() {
        //given
        List<StreamSampleDto> list = List.of(
                StreamSampleDto.of("Alice"),
                StreamSampleDto.of("Bob"),
                StreamSampleDto.of("Charlie")
        );

        //when
        List<StreamSampleDto> result = streamService.updateContentToUpperCaseBad(list);

        //then
        assertThat(result).hasSize(3)
                .extracting("content")
                .containsExactly(
                        "Alice".toUpperCase(),
                        "Bob".toUpperCase(),
                        "Charlie".toUpperCase()
                );
    }

    @DisplayName("결과를 대문자로 변경한다.")
    @Test
    void updateContentToUpperCaseGood() {
        //given
        List<StreamSampleDto> list = List.of(
                StreamSampleDto.of("Alice"),
                StreamSampleDto.of("Bob"),
                StreamSampleDto.of("Charlie")
        );

        //when
        List<StreamSampleDto> result = streamService.updateContentToUpperCaseGood(list);

        //then
        assertThat(result).hasSize(3)
                .extracting("content")
                .containsExactly(
                        "Alice".toUpperCase(),
                        "Bob".toUpperCase(),
                        "Charlie".toUpperCase()
                );
    }

}
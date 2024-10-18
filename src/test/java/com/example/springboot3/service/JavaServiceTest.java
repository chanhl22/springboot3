package com.example.springboot3.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
class JavaServiceTest {

    @Autowired
    private JavaService javaService;

    @DisplayName("toList()는 불변 리스트를 반환합니다.")
    @Test
    void listAddToList() {
        //given
        List<String> request = List.of("hello", "world", "spring");

        //when //then
        assertThatThrownBy(() -> javaService.listAddToList(request))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @DisplayName("Collectors.toList()는 가변 리스트를 반환합니다.")
    @Test
    void listAddToCollectors() {
        //given
        List<String> request = List.of("hello", "world", "spring");

        //when
        List<String> result = javaService.listAddToCollectors(request);

        //then
        assertThat(result).hasSize(4)
                .contains("first");
    }

}
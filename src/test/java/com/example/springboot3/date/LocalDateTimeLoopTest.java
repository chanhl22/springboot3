package com.example.springboot3.date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LocalDateTimeLoopTest {

    @Autowired
    private LocalDateTimeLoop localDateTimeLoop;

    @DisplayName("시작 날짜부터 끝 날짜까지 추출한다.")
    @Test
    void updateContentToUpperCaseBad() {
        //given
        LocalDateTime startDateTime = LocalDateTime.of(2025, 1, 1, 0, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2025, 1, 10, 0, 0);

        //when
        List<String> results = localDateTimeLoop.localDateTimeLoop(startDateTime, endDateTime);

        //then
        assertThat(results).hasSize(10)
                .containsExactly(
                        "20250101", "20250102", "20250103", "20250104", "20250105",
                        "20250106", "20250107", "20250108", "20250109", "20250110"
                );
    }

}
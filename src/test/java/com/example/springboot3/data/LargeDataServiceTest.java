package com.example.springboot3.data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LargeDataServiceTest {

    @Autowired
    private LargeDataService largeDataService;

    @DisplayName("데이터 1000000개를 적재한다.")
    @Test
    void listAddToCollectors() {
        //when
        List<Long> result = largeDataService.save();

        //then
        assertThat(result).hasSize(1000000);
    }

}
package com.example.springboot3.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
class CreateDateOrderOrderServiceTest {

    @Autowired
    private CreateDateOrderService createDateOrderService;

    @DisplayName("동시에 여러개 저장 - 실패 케이스")
    @Test
    void saveFail() {
        //given
        Long id1 = createDateOrderService.save();
        Long id2 = createDateOrderService.save();
        Long id3 = createDateOrderService.save();
        Long id4 = createDateOrderService.save();
        Long id5 = createDateOrderService.save();
        Long id6 = createDateOrderService.save();

        //when
        List<CreateDateOrder> results = createDateOrderService.findAll();

        //then
        assertThat(results).hasSize(6)
                .extracting("id")
                .containsExactly(id6, id5, id4, id3, id2, id1);
    }

    @DisplayName("동시에 여러개 저장 - 성공 케이스")
    @Test
    void saveSuccess() {
        //given
        Long id1;
        LocalDateTime thePast1 = LocalDateTime.of(2024, 11, 3, 8, 45, 31);
        try (MockedStatic<LocalDateTime> utilities = Mockito.mockStatic(LocalDateTime.class)) {
            utilities.when(() -> LocalDateTime.now(ArgumentMatchers.any(Clock.class))).thenReturn(thePast1);
            System.out.println(LocalDateTime.now());
            System.out.println(LocalDateTime.now(Clock.systemDefaultZone()));
            id1 = createDateOrderService.save();
        }

        System.out.println(LocalDateTime.now());

        Long id2;
        LocalDateTime thePast2 = LocalDateTime.of(2024, 12, 3, 8, 45, 31);
        try (MockedStatic<LocalDateTime> utilities = Mockito.mockStatic(LocalDateTime.class)) {
            utilities.when(() -> LocalDateTime.now(ArgumentMatchers.any(Clock.class))).thenReturn(thePast2);
            id2 = createDateOrderService.save();
        }

        Long id3;
        LocalDateTime thePast3 = LocalDateTime.of(2025, 1, 3, 8, 45, 31);
        try (MockedStatic<LocalDateTime> utilities = Mockito.mockStatic(LocalDateTime.class)) {
            utilities.when(() -> LocalDateTime.now(ArgumentMatchers.any(Clock.class))).thenReturn(thePast3);
            id3 = createDateOrderService.save();
        }

        Long id4;
        LocalDateTime thePast4 = LocalDateTime.of(2025, 2, 3, 8, 45, 31);
        try (MockedStatic<LocalDateTime> utilities = Mockito.mockStatic(LocalDateTime.class)) {
            utilities.when(() -> LocalDateTime.now(ArgumentMatchers.any(Clock.class))).thenReturn(thePast4);
            id4 = createDateOrderService.save();
        }

        Long id5;
        LocalDateTime thePast5 = LocalDateTime.of(2025, 3, 3, 8, 45, 31);
        try (MockedStatic<LocalDateTime> utilities = Mockito.mockStatic(LocalDateTime.class)) {
            utilities.when(() -> LocalDateTime.now(ArgumentMatchers.any(Clock.class))).thenReturn(thePast5);
            id5 = createDateOrderService.save();
        }

        Long id6;
        LocalDateTime thePast6 = LocalDateTime.of(2025, 4, 3, 8, 45, 31);
        try (MockedStatic<LocalDateTime> utilities = Mockito.mockStatic(LocalDateTime.class)) {
            utilities.when(() -> LocalDateTime.now(ArgumentMatchers.any(Clock.class))).thenReturn(thePast6);
            id6 = createDateOrderService.save();
        }

        //when
        List<CreateDateOrder> results = createDateOrderService.findAll();

        //then
        assertThat(results).hasSize(6)
                .extracting("id")
                .containsExactly(id6, id5, id4, id3, id2, id1);
    }

}
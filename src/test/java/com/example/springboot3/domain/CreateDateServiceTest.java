package com.example.springboot3.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
class CreateDateServiceTest {

    @Autowired
    private CreateDateRepository createDateRepository;

    @DisplayName("동시에 여러개 저장")
    @Test
    void save() {
        //given
        CreateDate entity1 = createCreateDate();
        CreateDate entity2 = createCreateDate();
        CreateDate entity3 = createCreateDate();

        //when
        List<CreateDate> results = createDateRepository.findAllByOrderByCreateDateDesc();

        //then
        assertThat(results).hasSize(3)
                .extracting("createDate")
                .containsExactly(entity3.getCreateDate(), entity2.getCreateDate(), entity1.getCreateDate());

    }

    private CreateDate createCreateDate() {
        return createDateRepository.save(CreateDate.createEntity());
    }

}
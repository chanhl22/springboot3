package com.example.springboot3.domain.query.method;

import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
class MemberTeamTest {

    @Autowired
    private MemberRepository memberRepository;

    @DisplayName("And")
    @Test
    void and() {
        //given
        Member member1 = memberRepository.save(new Member("곽두팔", 22));
        Member member2 = memberRepository.save(new Member("박상두", 31));
        Member member3 = memberRepository.save(new Member("김봉순", 27));

        //when
        List<Member> result = memberRepository.findByUsernameAndAge("곽두팔", 22);

        //then
        assertThat(result).hasSize(1)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("곽두팔", 22)
                );
    }

    @DisplayName("Or")
    @Test
    void or() {
        //given
        Member member1 = memberRepository.save(new Member("곽두팔", 22));
        Member member2 = memberRepository.save(new Member("박상두", 31));
        Member member3 = memberRepository.save(new Member("김봉순", 27));

        //when
        List<Member> result = memberRepository.findByUsernameOrAge("김봉순", 22);

        //then
        assertThat(result).hasSize(2)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("곽두팔", 22),
                        Tuple.tuple("김봉순", 27)
                );
    }

}
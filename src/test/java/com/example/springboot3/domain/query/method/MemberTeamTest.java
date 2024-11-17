package com.example.springboot3.domain.query.method;

import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
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
        memberRepository.save(new Member("곽두팔", 22));
        memberRepository.save(new Member("박상두", 31));
        memberRepository.save(new Member("김봉순", 27));

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
        memberRepository.save(new Member("곽두팔", 22));
        memberRepository.save(new Member("박상두", 31));
        memberRepository.save(new Member("김봉순", 27));

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

    @DisplayName("Is, Equal")
    @Test
    void is_equal() {
        //given
        memberRepository.save(new Member("곽두팔", 22));
        memberRepository.save(new Member("박상두", 31));
        memberRepository.save(new Member("김봉순", 27));
        memberRepository.save(new Member("김봉순", 25));

        //when
        List<Member> result1 = memberRepository.findByUsernameIs("김봉순");
        List<Member> result2 = memberRepository.findByUsernameEquals("김봉순");
        List<Member> result3 = memberRepository.findByUsername("김봉순");

        //then
        assertThat(result1).hasSize(2)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("김봉순", 27),
                        Tuple.tuple("김봉순", 25)
                );
        assertThat(result2).hasSize(2)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("김봉순", 27),
                        Tuple.tuple("김봉순", 25)
                );
        assertThat(result3).hasSize(2)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("김봉순", 27),
                        Tuple.tuple("김봉순", 25)
                );
    }

    @DisplayName("Between")
    @Test
    void between() {
        //given
        memberRepository.save(new Member("곽두팔", 22));
        memberRepository.save(new Member("박상두", 31));
        memberRepository.save(new Member("김봉순", 27));
        memberRepository.save(new Member("김봉순", 25));

        //when
        List<Member> result = memberRepository.findByAgeBetween(22, 31);

        //then
        assertThat(result).hasSize(4)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("곽두팔", 22),
                        Tuple.tuple("박상두", 31),
                        Tuple.tuple("김봉순", 27),
                        Tuple.tuple("김봉순", 25)
                );
    }

    @DisplayName("LessThan, LessThanEqual")
    @Test
    void lessThan_lessThanEqual() {
        //given
        memberRepository.save(new Member("곽두팔", 22));
        memberRepository.save(new Member("박상두", 31));
        memberRepository.save(new Member("김봉순", 27));
        memberRepository.save(new Member("김봉순", 25));

        //when
        List<Member> result1 = memberRepository.findByAgeLessThan(31);
        List<Member> result2 = memberRepository.findByAgeLessThanEqual(31);

        //then
        assertThat(result1).hasSize(3)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("곽두팔", 22),
                        Tuple.tuple("김봉순", 27),
                        Tuple.tuple("김봉순", 25)
                );
        assertThat(result2).hasSize(4)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("곽두팔", 22),
                        Tuple.tuple("박상두", 31),
                        Tuple.tuple("김봉순", 27),
                        Tuple.tuple("김봉순", 25)
                );
    }

    @DisplayName("GreaterThan, GreaterThanEqual")
    @Test
    void greaterThan_greaterThanEqual() {
        //given
        memberRepository.save(new Member("곽두팔", 22));
        memberRepository.save(new Member("박상두", 31));
        memberRepository.save(new Member("김봉순", 27));
        memberRepository.save(new Member("김봉순", 25));

        //when
        List<Member> result1 = memberRepository.findByAgeGreaterThan(22);
        List<Member> result2 = memberRepository.findByAgeGreaterThanEqual(22);

        //then
        assertThat(result1).hasSize(3)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("박상두", 31),
                        Tuple.tuple("김봉순", 27),
                        Tuple.tuple("김봉순", 25)
                );
        assertThat(result2).hasSize(4)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("곽두팔", 22),
                        Tuple.tuple("박상두", 31),
                        Tuple.tuple("김봉순", 27),
                        Tuple.tuple("김봉순", 25)
                );
    }

    @DisplayName("After, Before")
    @Test
    void after_before() {
        //given
        memberRepository.save(new Member("곽두팔", 22, LocalDateTime.of(2001, 10, 21, 0, 0, 0)));
        memberRepository.save(new Member("박상두", 31, LocalDateTime.of(1992, 8, 8, 0, 0, 0)));
        memberRepository.save(new Member("김봉순", 27, LocalDateTime.of(1996, 2, 19, 0, 0, 0)));
        memberRepository.save(new Member("김봉순", 25, LocalDateTime.of(1998, 5, 30, 0, 0, 0)));

        //when
        List<Member> result1 = memberRepository.findByAgeAfter(22);
        List<Member> result2 = memberRepository.findByAgeBefore(31);

        //then
        assertThat(result1).hasSize(3)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("박상두", 31),
                        Tuple.tuple("김봉순", 27),
                        Tuple.tuple("김봉순", 25)
                );
        assertThat(result2).hasSize(3)
                .extracting("username", "age")
                .containsExactly(
                        Tuple.tuple("곽두팔", 22),
                        Tuple.tuple("김봉순", 27),
                        Tuple.tuple("김봉순", 25)
                );
    }

}

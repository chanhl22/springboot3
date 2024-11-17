package com.example.springboot3.domain.query.method;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsernameAndAge(String username, int age);

    List<Member> findByUsernameOrAge(String username, int age);

    List<Member> findByUsernameIs(String username);

    List<Member> findByUsernameEquals(String username);

    List<Member> findByUsername(String username);

    List<Member> findByAgeBetween(int age1, int age2);

    List<Member> findByAgeLessThan(int age);

    List<Member> findByAgeLessThanEqual(int age);

    List<Member> findByAgeGreaterThan(int age);

    List<Member> findByAgeGreaterThanEqual(int age);

}

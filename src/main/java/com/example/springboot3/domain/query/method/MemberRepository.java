package com.example.springboot3.domain.query.method;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsernameAndAge(String username, int age);

    List<Member> findByUsernameOrAge(String username, int age);

}

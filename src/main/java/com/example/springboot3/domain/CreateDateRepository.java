package com.example.springboot3.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreateDateRepository extends JpaRepository<CreateDate, Long> {

    List<CreateDate> findAllByOrderByCreateDateDesc();

}

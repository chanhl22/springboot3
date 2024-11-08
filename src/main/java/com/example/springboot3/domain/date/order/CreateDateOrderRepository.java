package com.example.springboot3.domain.date.order;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreateDateOrderRepository extends JpaRepository<CreateDateOrder, Long> {

    List<CreateDateOrder> findAllByOrderByCreateDateDesc();

}

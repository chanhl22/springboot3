package com.example.springboot3.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LargeDataRepository extends JpaRepository<LargeData, Long> {
}

package com.example.springboot3.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class CreateDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDateTime updateDate;

    @Builder
    private CreateDate(LocalDateTime createDate, LocalDateTime updateDate) {
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public static CreateDate createEntity(LocalDateTime createDate) {
        return CreateDate.builder()
                .createDate(createDate)
                .build();
    }

    public static CreateDate createEntity() {
        return CreateDate.builder()
                .build();
    }

}

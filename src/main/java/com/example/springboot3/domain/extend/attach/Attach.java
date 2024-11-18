package com.example.springboot3.domain.extend.attach;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Attach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attachId;

    @Column(nullable = false)
    private String filename;

    @Column(nullable = false)
    private String path;

    @Column(nullable = false)
    private String realPath;

    @Builder
    private Attach(String filename, String path, String realPath) {
        this.filename = filename;
        this.path = path;
        this.realPath = realPath;
    }

    public static Attach create(String filename, String path, String realPath) {
        return Attach.builder()
                .filename(filename)
                .path(path)
                .realPath(realPath)
                .build();
    }

}

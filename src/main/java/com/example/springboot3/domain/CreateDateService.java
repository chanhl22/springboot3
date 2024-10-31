package com.example.springboot3.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateDateService {

    private final CreateDateRepository createDateRepository;

    public Long save(){
        CreateDate saved = createDateRepository.save(CreateDate.createEntity());
        return saved.getId();
    }

}

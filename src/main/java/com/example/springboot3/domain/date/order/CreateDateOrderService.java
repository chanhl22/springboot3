package com.example.springboot3.domain.date.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreateDateOrderService {

    private final CreateDateOrderRepository createDateOrderRepository;

    public Long save(){
        CreateDateOrder saved = createDateOrderRepository.save(CreateDateOrder.createEntity());
        return saved.getId();
    }

    public List<CreateDateOrder> findAll(){
        return createDateOrderRepository.findAllByOrderByCreateDateDesc();
    }

}

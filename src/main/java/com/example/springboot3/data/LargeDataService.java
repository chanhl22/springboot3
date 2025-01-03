package com.example.springboot3.data;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LargeDataService {

    private final LargeDataRepository largeDataRepository;

    public List<Long> save() {
        List<Long> result = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            result.add(largeDataRepository.save(LargeData.create()).getId());
        }
        return result;
    }

}

package com.example.springboot3.domain.stream;

import com.example.springboot3.domain.stream.dto.StreamSampleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamService {

    public List<StreamSampleDto> updateContentToUpperCaseBad(List<StreamSampleDto> list) {
        return list.stream()
                .peek(sample -> sample.updateContent(sample.getContent().toUpperCase()))
                .toList();
    }

    public List<StreamSampleDto> updateContentToUpperCaseGood(List<StreamSampleDto> list) {
        return list.stream()
                .map(sample -> sample.updateContentAndReturn(sample.getContent().toUpperCase()))
                .toList();
    }

}

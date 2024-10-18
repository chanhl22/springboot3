package com.example.springboot3.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JavaService {

    public List<String> listAddToList(List<String> request) {
        List<String> uppercase = request.stream()
                .map(String::toUpperCase)
                .toList();
        uppercase.add(0, "first");

        return uppercase;
    }

    public List<String> listAddToCollectors(List<String> request) {
        List<String> uppercase = request.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        uppercase.add(0, "first");

        return uppercase;
    }

}

package com.example.springboot3.stream;

import java.util.List;
import java.util.stream.Collectors;

public class PeekAndMapDiff {
    public static void main(String[] args) {
        map();
        peek();
    }

    private static void map() {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // 각 이름의 길이를 계산하여 새로운 리스트 생성
        List<Integer> nameLengths = names.stream()
                .map(String::length) // 각 문자열의 길이로 변환
                .collect(Collectors.toList());

        System.out.println(nameLengths); // 출력: [5, 3, 7]
    }

    private static void peek() {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // 각 이름을 출력하면서 스트림을 처리
        names.stream()
                .peek(name -> System.out.println("Processing: " + name)) // 각 요소를 출력
                .map(String::toUpperCase) // 각 문자열을 대문자로 변환
                .forEach(System.out::println); // 최종 결과 출력
    }

}

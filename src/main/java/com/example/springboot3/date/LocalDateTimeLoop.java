package com.example.springboot3.date;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.temporal.ChronoUnit.DAYS;

@Component
public class LocalDateTimeLoop {

    public List<String> localDateTimeLoop(LocalDateTime start, LocalDateTime end) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        return Stream.iterate(start, date -> date.plusDays(1))
                .limit(start.until(end, DAYS) + 1)
                .map(date -> date.format(formatter))
                .collect(Collectors.toList());
    }

}

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

    public String switchV1(int day) {
        String dayString = "";
        switch (day) {
            case 1:  dayString = "MONDAY";
                break;
            case 2:  dayString = "TUESDAY";
                break;
            case 3:  dayString = "Wednesday";
                break;
            case 4:  dayString = "Thursday";
                break;
            case 5:  dayString = "Friday";
                break;
            case 6:  dayString = "Saturday";
                break;
            case 7:  dayString = "Sunday";
                break;
            default: dayString = "Invalid month";
                break;
        }
        return dayString;
    }

    public String switchV2(int day) {
        switch (day) {
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid month";
        }
    }

    public String switchV3(int day) {
        return switch (day) {
            case 1:
                yield "MONDAY";
            case 2:
                yield "TUESDAY";
            case 3:
                yield "Wednesday";
            case 4:
                yield "Thursday";
            case 5:
                yield "Friday";
            case 6:
                yield "Saturday";
            case 7:
                yield "Sunday";
            default:
                yield "Invalid month";
        };
    }

    public String switchV4(int day) {
        return switch (day) {
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid month";
        };
    }

}

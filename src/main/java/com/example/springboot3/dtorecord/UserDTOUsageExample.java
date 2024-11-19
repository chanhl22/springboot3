package com.example.springboot3.dtorecord;

public class UserDTOUsageExample {
    public static void main(String[] args) {
        useDto();
        useRecord();
    }

    private static void useDto() {
        UserDTO user = new UserDTO("Ashutosh", 25, "ashutosh@example.com");

        // 데이터 접근
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getEmail());

        // toString() 메서드 사용
        System.out.println(user);

        // 객체 비교
        UserDTO anotherUser = new UserDTO("Vishakha", 22, "vishakha@example.com");
        System.out.println(user.equals(anotherUser));
    }

    private static void useRecord() {
        UserRecord user = new UserRecord("Ashutosh", 25, "ashutosh@example.com");

        // 데이터 접근
        System.out.println(user.name());
        System.out.println(user.age());
        System.out.println(user.email());

        // toString() 메서드 사용
        System.out.println(user);

        // 객체 비교
        UserRecord anotherUser = new UserRecord("Vishakha", 22, "vishakha@example.com");
        System.out.println(user.equals(anotherUser));
    }
}
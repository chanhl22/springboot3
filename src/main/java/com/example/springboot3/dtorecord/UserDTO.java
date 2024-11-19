package com.example.springboot3.dtorecord;

import java.util.Objects;

public class UserDTO {

    private String name;

    private int age;

    private String email;

    // 생성자
    public UserDTO(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter와 Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString() 메서드 재정의
    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    // 객체 비교를 위해 equals() 메서드 재정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO UserDto = (UserDTO) o;
        return age == UserDto.age && Objects.equals(name, UserDto.name) && Objects.equals(email, UserDto.email);
    }

    // hashCode() 메서드 재정의
    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

}
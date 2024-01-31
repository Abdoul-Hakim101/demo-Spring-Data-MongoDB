package com.example.demo;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private Address address;

    private List<String> favSubjects;
    private double totalSpentInBooks;
    private LocalDateTime created;
}

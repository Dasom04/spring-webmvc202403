package com.spring.mvc.rest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
// JSON 데이터 받을 클래스 제작
public class Person {
    private String name;

    private int age;
    private List<String> hobby;


}

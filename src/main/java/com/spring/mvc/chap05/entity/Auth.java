package com.spring.mvc.chap05.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter @ToString // 생성자를 통해 값을 세팅 할 수 있도록
public enum Auth {

    COMMON("일반회원", 1),
    ADMIN("관리자회원", 2);

    private String description; // 관한 설명

    private int authNumber; // 권한 번호



}

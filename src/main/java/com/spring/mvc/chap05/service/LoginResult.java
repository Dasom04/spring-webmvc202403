package com.spring.mvc.chap05.service;

public enum LoginResult {
    // 로그인 성공, 아이디 없음, 비밀번호 틀림 세가지 상황 상수로 표현.
    // 로그인 성공, 실패로 할거면 boolean으로 표현해도 된다.

    SUCCESS,
    NO_ACC,
    NO_PW

}

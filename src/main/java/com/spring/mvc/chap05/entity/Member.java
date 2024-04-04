package com.spring.mvc.chap05.entity;

import lombok.*;

import java.time.LocalDateTime;

/*
# 회원 관리 테이블
CREATE TABLE tbl_member (
	account VARCHAR(50),
    password VARCHAR (150) NOT NULL,
    name VARCHAR(50) NOT NULL,
    email varchar(100) NOT NULL UNIQUE,
    auth VARCHAR(20) DEFAULT 'COMMON',
    reg_date DATETIME DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT pk_member PRIMARY KEY (account)
);
 */

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Member {

    private String account;
    private String password;
    private String name;
    private String email;
    private Auth auth;
    private LocalDateTime regDate;

    // 기존 테이블에서 컬럼을 추가 했기 때문에
    // DB 테이블과 1:1 매칭되는 Entity도 필드가 증가해야한다.
    private String sessionId;
    private LocalDateTime limitTime;


}






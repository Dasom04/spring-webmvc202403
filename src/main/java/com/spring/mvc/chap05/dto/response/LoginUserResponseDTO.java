package com.spring.mvc.chap05.dto.response;

import lombok.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginUserResponseDTO {

    private String account;
    private String name;
    private String email;
    private String auth;
    private String profile;
    private String loginMethod; // 로그인 방식 추가됨

}

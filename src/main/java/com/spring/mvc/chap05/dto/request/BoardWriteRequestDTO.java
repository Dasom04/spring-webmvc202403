package com.spring.mvc.chap05.dto.request;

import lombok.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class BoardWriteRequestDTO {

    private String writer;
    private String title;
    private String content;
}

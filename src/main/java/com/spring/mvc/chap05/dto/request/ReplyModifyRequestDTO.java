package com.spring.mvc.chap05.dto.request;

import com.spring.mvc.chap05.entity.Reply;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter @Getter @ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class ReplyModifyRequestDTO {

    @NotNull
    private  int rno; // 수정할 댓글 번호

    @NotBlank
    private  String text; // 수정할 댓글 내용

    // dto를 entity로 바꾸는 메서드
    // 서비스 쪽에서 toEntity 부를 예정
    public Reply toEntity() {
        return Reply.builder()
                .replyNo(rno)
                .replyText(text)
                .build();
    }

}

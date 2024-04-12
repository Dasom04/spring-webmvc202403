<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Insert Your Title</title>
</head>
<body>
        
    <input type="text" name="email" id="userEmail" placeholder="이메일을 입력하시오.">
    <button type="button" id="mail-check-btn">이메일 인증</button>

    <br>

    <input type="text" id="mail-check-input" placeholder="인증번호 6자리를 입력하세요." maxlength="6", disabled> <br>
    <span id="mailCheckMsg"></span>


    <script>

        let code = ''; // 이메일 전송 인증번호 저장을 위한 변수.

        // 이메일 인증버튼 클릭 이벤트
        document.getElementById('mail-check-btn').onclick = () => {
            // 우선 올바른 이메일 형식인지, 중복이 발생하지 않았는지부터 먼저 체크해 주세요.
            // 여기에서는 따로 진행하지 않겠습니다.
            
            const email = document.getElementById('userEmail').value.trim();
            console.log('완성된 email: ', email);

            fetch('/members/email', { // 서버로 이메일을 전송해달라 라는 메서드
                method: 'post',
                headers: {
                    'Content-type': 'text/plain'
                },
                body: email
            })
            .then(res => res.text())
            .then(data => {
                console.log('인증번호: ', data);

                code = data; // 서버가 전달한 인증번호를 전역변수에 저장.
                
                // 이메일 전송이 완료되면 이메일 입력창을 readOnly로 막기 (원하시는 대로 하세요.)
                document.getElementById('userEmail').readOnly = true;

                // (disabled 풀어주기) 비활성화된 인증번호 입력창을 활성화 하기
                document.getElementById('mail-check-input').disabled = false;
                alert('인증번호가 전송되었습니다. 확인 후 입력란에 정확히 입력하세요!');
            })
            .catch(error => {
                console.log(error);
                alert('이메일 전송에 실패했습니다. 존재하는 이메일인지 확인해보세요.');
            });
            
        };

        // 인증번호 검증
        // blur -> focus가 빠지는 경주 발생.
        document.getElementById('mail-check-input').onblur = e => {
            console.log('blur 이벤트가 발생했다!');

            const inputCode = e.target.value;
            if (inputCode === code) {
                document.getElementById('mailCheckMsg').textContent = '인증번호가 일치합니다!';
                document.getElementById('mailCheckMsg').style.color = 'skyblue';
                e.target.style.display = 'none';

            } else {
                document.getElementById('mailCheckMsg').textContent = '인증번호를 다시 확인하세요!';
                document.getElementById('mailCheckMsg').style.color = 'red';
                e.target.focus();
            }


        }






    </script>

</body>
</html>
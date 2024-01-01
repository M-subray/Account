package com.example.account.exception;

import com.example.account.type.ErrorCode;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
/*
Exception 클래스가 가장 상위
하위에 Unchecked Exception 인 RuntimeException 이 존재하며
다수의 Checked Exception 이 존재한다.
Unchecked Exception 을 쓰는 이유는 ?
프로그램의 동작을 멈추지 않고 오류 표기만 해주면 될 때 사용하기 위함
(프로그램은 계속해서 동작)
또한 checked Exception 을 사용하게 되면 컴파일러가 예외처리를 강제해
transaction 에서 롤백이 일어나지 않는다. (그냥 프로그램 뻗음 ㅜ)
 */
public class AccountException extends RuntimeException{
    private ErrorCode errorCode;
    private String errorMessage;

    public AccountException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.errorMessage = errorCode.getDescription();
    }
}

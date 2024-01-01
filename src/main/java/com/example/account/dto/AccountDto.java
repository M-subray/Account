package com.example.account.dto;

import com.example.account.domain.Account;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    private Long userId;
    private String accountNumber;
    private Long balance;

    private LocalDateTime registeredAt;
    private LocalDateTime unRegisteredAt;

    public static AccountDto fromEntity(Account account) {  // 이렇게 하면 프라퍼티 생성자를 깔끔하게 만들 수 있다.
        return AccountDto.builder()
                .userId(account.getId())
                .accountNumber(account.getAccountNumber())
                .balance(account.getBalance())
                .registeredAt(account.getResisteredAt())
                .unRegisteredAt(account.getUnResisteredAt())
                .build();
    }
}

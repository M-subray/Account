package com.example.account.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
/*
dto는 왜 쓰는가 ?
나중에 분명 의도치 않은 상황이 생긴다고 하는데.. 아직은 잘 모르겠음..
 */
public class AccountInfo {
    private String accountNumber;
    private Long balance;
}

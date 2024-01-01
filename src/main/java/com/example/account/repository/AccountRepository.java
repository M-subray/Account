package com.example.account.repository;

import com.example.account.domain.Account;
import com.example.account.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    // 첫번째 값을 찾는데 Order에서 Id 정렬으로, Desc는 역순으로.
    Optional<Account> findFirstByOrderByIdDesc();

    Integer countByAccountUser(AccountUser accountUser);

    Optional<Account> findByAccountNumber(String AccountNumbar);

    //JPA의 기능중 하나로 Account에 AccountUser가 포함 돼 있기 때문에 이렇게 사용이 가능하다 ?
    List<Account> findByAccountUser(AccountUser accountUser);
}

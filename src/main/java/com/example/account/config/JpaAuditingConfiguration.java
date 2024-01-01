package com.example.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration   // Bean 등록 위함
/*
어플 실행 될 때 자동 스캔되게 하기 위함
EnableJpaAuditing 켜지고 어플이 켜지게 되고
db에 데이터 저장 및 업데이트시 CreateDate, LastModifiedDate 어노테이션의 값들을
자동으로 저장해 주게 된다.
 */
@EnableJpaAuditing
public class JpaAuditingConfiguration {  // @EntityListeners(AuditingEntityListener.class)을 위해 만들어진 클래스
}

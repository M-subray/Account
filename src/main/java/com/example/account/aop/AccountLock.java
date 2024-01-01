package com.example.account.aop;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AccountLock {
    long tryLockTime() default 5000L;  // 여기서 가져온 값으로 해당 시간동안 기다려보겠다라는 뜻?..
}

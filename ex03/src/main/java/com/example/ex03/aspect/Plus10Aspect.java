package com.example.ex03.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
@Slf4j
public class Plus10Aspect {

//    JoinPoint(시점)
    @Around("@annotation(com.example.ex03.aspect.Plus10)")
    public Integer aroundPlus10(ProceedingJoinPoint proceedingJoinPoint){
        log.info("pointCut: " + proceedingJoinPoint);
        log.info("test: " + proceedingJoinPoint.getKind());
        log.info("test: " + proceedingJoinPoint.toLongString());
        log.info("test: " + proceedingJoinPoint.getSignature());
        log.info("test: " + proceedingJoinPoint.getTarget().toString());
        Integer result = 0;
        try {
            log.info("test: " + proceedingJoinPoint.proceed());
            result = (Integer)proceedingJoinPoint.proceed();
        } catch (Throwable throwable) { //point cut 예외 처리 가능
            throwable.printStackTrace();
        }

        return result + 10;
    }
}

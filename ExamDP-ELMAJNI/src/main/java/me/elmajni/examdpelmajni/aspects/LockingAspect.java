package me.elmajni.examdpelmajni.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LockingAspect {

    Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(me.elmajni.examdpelmajni.aspects.Lock)")
    public Object lock(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("From Locking Aspect ... Before "+proceedingJoinPoint.getSignature());
        Object result = proceedingJoinPoint.proceed();
        logger.info("From Locking Aspect ... After "+proceedingJoinPoint.getSignature());
        return result;
    }

    /*public Object log(ProceedingJoinPoint joinPoint) {
        System.out.println("verrouillée Methode ");
        return null;
    }*/
}

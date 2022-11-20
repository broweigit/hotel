package server.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NonFunctionalAop {
//    @Pointcut("execution(* server.service.*Service.*(..))")
    private void servicePt(){}

//    @Around("NonFunctionalTest.servicePt()")
    public Object rubSpeed(ProceedingJoinPoint pjp) throws Throwable {

        Signature signature = pjp.getSignature();
        System.out.println("method: " + signature.getDeclaringTypeName() + " " + signature.getName());

        long start = System.currentTimeMillis();
        Object ret = pjp.proceed();
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
        return ret;
    }

}

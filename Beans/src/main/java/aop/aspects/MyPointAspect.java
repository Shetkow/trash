package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointAspect {
    @Pointcut("execution(* abs*(..))")
    public void allAddMethods(){

    }
}

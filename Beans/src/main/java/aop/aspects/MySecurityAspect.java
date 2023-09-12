package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MySecurityAspect {
    @Before("aop.aspects.MyPointAspect.allAddMethods()")
    public void allSecurityAddMethods(){
        System.out.println("Check rules for get");
    }
}

package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@Aspect
@Order(6)
public class LoggingAspect {
//    @Before("aop.aspects.MyPointAspect.allAddMethods()")
//    private void loggingGetMethods(JoinPoint joinPoint) {
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println(methodSignature.getMethod() + "Получили метод");
//        System.out.println(methodSignature.getReturnType() + "Получили возрощаемое значение");
//        System.out.println(methodSignature.getName() + " Получили имя метода");
//        System.out.println(methodSignature.getDeclaringType() + " Получили декларированные значения");
//        if(methodSignature.getName().equals("addBook")){
//            Object[] arguments = joinPoint.getArgs();
//            for(Object obj : arguments){
//                if(obj instanceof Book){
//                    Book myBook = (Book) obj;
//                    System.out.println("Info about book" + myBook.getAuthor() + "  " + myBook.getName());
//
//                }else if(obj instanceof String){
//                    System.out.println("Book take " + obj);
//                }
//            }
//        }
//        System.out.println("_------------------------------------------------------------_");
//        System.out.println("Write in log");
//    }
}

//package org.example.aop.aspects;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class NewLoggingAspect {
//    @Around("execution(public String returnBook())")
//    public Object arounAdviceReturnBook(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("arounAdviceReturnBook: Пытаемся вернуть книугу");
//        long start = System.currentTimeMillis();
//        Object targetMethodResult = null;
//        try {
//            targetMethodResult = proceedingJoinPoint.proceed();
//        }catch (Exception e){
//            System.out.println("Было выбрашено исключение " + e);
//            throw e;
//        }
//
//
//        long end = System.currentTimeMillis();
//
//        System.out.println("arounAdviceReturnBook книгу вернули");
//
//        System.out.println("Метод отработал за " + (end - start) + "милимекунд");
//
//        return targetMethodResult;
//
//    }
//}

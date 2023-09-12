//package org.example.aop.aspects;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.example.aop.Book;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//@Order(2)
//public class LoggingAspect {
////    @Pointcut("execution(* org.example.aop.UniversityLibrary.*(..))")
////    private void allMethodsFromUniLibrary(){}
////
////    @Pointcut("execution(public void returnMagazine())")
////    private void returnMethodsFromUniLibrary(){}
////    @Pointcut("allMethodsFromUniLibrary() && !returnMethodsFromUniLibrary() ")
////    private void allMethodsExecptReturnFromUniLibrary(){}
////    @Before("allMethodsExecptReturnFromUniLibrary()")
////    public void beforeallMethodsExecptReturnFromUniLibrary(){
////        System.out.println("beforeallMethodsExecptReturnFromUniLibrary: writing in Log#10");
////    }
////
////
//
//
//    //    @Pointcut("execution(* org.example.aop.UniversityLibrary.get*())")
////    private void allGetMethods() {
////    }
////
////    @Pointcut("execution(* org.example.aop.UniversityLibrary.return*())")
////    private void allReturnMethods() {
////    }
////
////    @Pointcut("allReturnMethods() || allGetMethods()")
////    private void allReturnAndGetMethods() {
////    }
////
////    @Before("allGetMethods()")
////    public void beforeGetLoggingMethods(){
////        System.out.println("beforeGetLoggingMethods: writing in Log#1 ");
////    }
////
////    @Before("allReturnMethods()")
////    public void beforeReturnLoggingMethods(){
////        System.out.println("beforeReturnLoggingMethods: writing in Log#2");
////    }
////
////    @Before("allReturnAndGetMethods()")
////    public void beforeReturnAndGetMethods(){
////        System.out.println("beforeReturnAndGetMethods: writing in Log#3");
////    }
//
//    @Before("org.example.aop.aspects.MyPointcuts.allAddMethods()")
//    public void beforeAddLogingAdvice(JoinPoint joinPoint) {
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("methodSignature = " + methodSignature);
//        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
//        System.out.println("methodSignature.getName() = " + methodSignature.getName());
//        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
//        System.out.println("methodSignature.getDeclaringTypeName() = " + methodSignature.getDeclaringTypeName());
//
//        if (methodSignature.getName().equals("addBook")) {
//            Object[] args = joinPoint.getArgs();
//            for (Object odj : args) {
//                if (odj instanceof Book) {
//                    Book myBook = (Book) odj;
//                    System.out.println("Название книги: " + myBook.getName() + "\n"
//                            + "год выпуска: " + myBook.getYearOfPublication());
//                } else if (odj instanceof String) {
//                    System.out.println("Книгу добавил " + odj);
//                }
//            }
//        }
//    }
//}

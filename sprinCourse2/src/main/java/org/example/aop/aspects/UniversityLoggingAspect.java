//package org.example.aop.aspects;
//
//import org.aspectj.lang.annotation.*;
//import org.example.aop.Student;
//import org.springframework.stereotype.Component;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.util.List;
//
//@Component
////@Aspect
//public class UniversityLoggingAspect {
////    @Before("execution(* getStudents())")
////    public void beforeGetStudents(){
////        System.out.println("beforeGetStudents: Log#1");
////    }
//
////    @AfterReturning(pointcut = "execution(* getStudents())",returning = "students")
////    public void afterReturningGetStudents(List<Student> students){
////        Student firstStudent = students.get(0);
////        String newName = "Mr." + firstStudent.getName();
////        firstStudent.setName(newName);
////        try(BufferedWriter bfWriter = new BufferedWriter(new FileWriter(new File("logSt.txt")))){
////            for(Student st:students){
////                bfWriter.append(st.toString());
////                bfWriter.append("\n");
////            }
////            bfWriter.flush();
////        }catch (Exception ex){
////            ex.fillInStackTrace();
////        }
////    }
////    @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exeption")
////    public void afterThrowingGetMethods(Throwable exeption){
////        System.out.println("Ловим исключение " + exeption);
////}
//
////    @After("execution(* getStudents())")
////    public void afterGetMethods() {
////System.out.println("Выполнение after Advice");
////    }
////    }

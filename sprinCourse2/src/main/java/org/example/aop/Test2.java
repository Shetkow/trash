//package org.example.aop;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import java.util.List;
//
//public class Test2 {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        University university = context.getBean("university", University.class);
//        university.addStudets();
//        try {
//            List<Student> students = university.getStudents();
//            System.out.println(students);
//        }catch (Exception e){
//            e.fillInStackTrace();
//        }
//
//        context.close();
//    }
//}

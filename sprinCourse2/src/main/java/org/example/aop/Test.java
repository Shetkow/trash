//package org.example.aop;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Test {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
//        Book book = context.getBean("book",Book.class);
//        universityLibrary.addBook("Pavel",book);
//universityLibrary.getMagazine();
//
//context.close();
//    }
//}

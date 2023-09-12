//package org.example.aop;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Test3 {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        for(int i = 0;i < 100; i++) {
//            UniversityLibrary library = context.getBean("universityLibrary", UniversityLibrary.class);
//            String bookName = library.returnBook();
//        }
//        context.close();
//
//    }
//}

//package org.example.aop;
//
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class University {
//    private List<Student> students = new ArrayList<>();
//
//    public void addStudets() {
//        Student st1 = new Student("Pavel", 2, 8.8);
//        Student st2 = new Student("Julia", 4, 9.0);
//        Student st3 = new Student("Mikhail", 3, 6.0);
//        students.add(st1);
//        students.add(st2);
//        students.add(st3);
//
//    }
//
//    public List<Student> getStudents(){
//        System.out.println("Information from method getStudents");
//        System.out.println(students.get(3));
//        System.out.println(students);
//        return students;
//    }
//}

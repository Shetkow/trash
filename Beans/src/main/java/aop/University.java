package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Students> studentsList = new ArrayList<>();

    public void addStudents() {
        Students std1 = new Students("PavelSch", 4, 6.5);
        Students std2 = new Students("Mikhail Pluchen", 5, 9.0);
        Students std3 = new Students("Katya Petrova", 1, 5);

        studentsList.add(std1);
        studentsList.add(std2);
        studentsList.add(std3);

    }

    public List<Students> getStudents(){
        System.out.println("Information from method getStudents");
        System.out.println(studentsList);
        return studentsList;
    }

}

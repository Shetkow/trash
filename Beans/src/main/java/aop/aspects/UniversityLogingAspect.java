package aop.aspects;

import aop.Students;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLogingAspect {
    @Before("execution(* getStudents())")
    public void beforeMethodGetStudents(){
        System.out.println("beforeMethodGetStudents - логируем получение списка студентов перед методом getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",returning = "students")
    public void afterMethodGetStudents(List<Students> students){
        Students firstSTD = students.get(0);
        String nameFirstStd = firstSTD.getFullName();
        nameFirstStd = nameFirstStd + " Coll!";
        firstSTD.setFullName(nameFirstStd);

        System.out.println("afterMethodGetStudents - логируем получение списка студентов псоле метода getStudents");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exeption")
    public void aftergThrowinMethodGetStudents(Throwable exeption){
        System.out.println("aftergThrowinMethodGetStudents- логируем выброс исключения " + exeption);
    }

    @After("execution(* getStudents())")
    public void afterAlreadyGetMethods(){

    }
}

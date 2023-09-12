package org.example.aop;

import org.springframework.stereotype.Component;

@Component()
public class UniversityLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Взяли книгу из UniversityLibrary ");
    }

    public void getMagazine() {
        System.out.println("Взяли журнал из UniversityLibrary");
        System.out.println("-------------------------------------");
    }

    public String returnBook() {
        System.out.println("Вернули книгу в UniversityLibrary");
        System.out.println("-------------------------------------");
        return "Колобок";
    }

    public void returnMagazine() {
        System.out.println("Вернули журнал в UniversityLibrary");
        System.out.println("-------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Добавили книгу в UniversityLibrary");
        System.out.println("-------------------------------------");
    }

    public void addMagazine() {
        System.out.println("добавили журнал в UniversityLibrary");
        System.out.println("-------------------------------------");
    }
}

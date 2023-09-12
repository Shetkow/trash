package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы взяли книгу " );
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал");
    }

    public void returnBook() {
        System.out.println("Мы возрощаем книгу");
    }

    public void returnMagazine() {
        System.out.println("Мы возрощаем журнал");
    }

    public void addBook(String name,Book book){
        System.out.println( name+  "добовляем книгу в библиотеку" + book.getName() + " " + book.getAuthor());
    }

    public void addMagazine(){
        System.out.println("мы добовляем журнал в библиотеку");
    }
}
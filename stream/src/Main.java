import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        List<Users> users = new ArrayList<>();
        users.add(new Users("Pavel", 89));
        users.add(new Users("Andrey", 18));
        users.add(new Users("Alex", 2));
        users.add(new Users("Julia", 22));
        users.stream()
                .sorted((u1,u2)-> u1.getName().compareTo(u2.getName()))
                .filter((a)-> a.getAge() < 40)
                .map(Users::getName)
                .forEach(System.out::println);

    }
}



package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Колобок")
    String name;

    @Value("Народное творчество")
    String author;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}

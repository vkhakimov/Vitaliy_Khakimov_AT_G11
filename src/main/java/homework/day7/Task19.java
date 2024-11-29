package homework.day7;

import homework.day7.task01.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task19 {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        Map<String, String> bookMap = new HashMap<>();

        library.add(new Book("Война и мир", "Толстой"));
        library.add(new Book("Преступление и наказание", "Достоевский"));
        library.add(new Book("Мастер и Маргарита", "Булгаков"));

        System.out.println("===============================================");
        System.out.print("Books names: ");
        for (Book book : library) {
            System.out.print(book.getName() + " ");
        }

        for (int i = 0; i < library.size(); i++) {
            bookMap.put(library.get(i).getName(), library.get(i).getAuthor());
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("bookMap keys:");
        for (String name : bookMap.keySet()) {
            System.out.println(name);
        }

        System.out.println("===============================================");
        System.out.println("bookMap values:");
        for (String author : bookMap.values()) {
            System.out.println(author);
        }

        System.out.println("===============================================");
        System.out.println("Iterate through the key and value:");
        for (Map.Entry<String, String> bookEntry : bookMap.entrySet()) {
            System.out.println(bookEntry);
        }
    }
}

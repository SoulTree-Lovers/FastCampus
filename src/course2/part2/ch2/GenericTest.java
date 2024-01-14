package course2.part2.ch2;

import course2.part1.ch2.model.Book;
import course2.part2.ch2.model.ObjectArray;

public class GenericTest {
    public static void main(String[] args) {
        ObjectArray<String> array = new ObjectArray<>(5);

        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "Java");
        array.set(3, "!!!!");

        for (int i=0; i< array.size(); i++) {
            System.out.println(array.get(i));
        }

        ObjectArray<Book> books = new ObjectArray<>(5);

        books.set(0, new Book("java", 15000, "한빛", "홍길동"));
        books.set(1, new Book("python", 20000, "한빛", "김길동"));
        books.set(2, new Book("spring", 30000, "한빛", "박길동"));

        for (int i=0; i< books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}

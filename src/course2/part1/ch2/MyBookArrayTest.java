package course2.part1.ch2;

import course2.part1.ch2.model.Book;
import course2.part1.ch2.model.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        // 책 3권의 데이터를 배열에 저장하고 출력
        BookArray books = new BookArray();
        books.add(new Book("java", 15000, "한빛", "홍길동"));
        books.add(new Book("python", 20000, "한빛", "김길동"));
        books.add(new Book("spring", 30000, "한빛", "박길동"));

        System.out.println(books.get(0));
        System.out.println(books.get(1));
        System.out.println(books.get(2));

        System.out.println(books.get(-1)); // 예외 발생 경우
    }
}

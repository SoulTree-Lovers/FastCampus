package course2.part1.ch2;

import course2.part1.ch2.model.Book;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력
        ArrayList<Book> books = new ArrayList<>(); // <Book> 을 사용하면, Object[] -> Book[] 배열로 바뀜. --> 업 캐스팅, 다운 캐스팅 불필요 장점 !

        books.add(new Book("java", 15000, "한빛", "홍길동"));
        books.add(new Book("python", 20000, "한빛", "김길동"));
        books.add(new Book("spring", 30000, "한빛", "박길동"));

        for (Book book: books) {
            System.out.println(book);
        }
    }
}

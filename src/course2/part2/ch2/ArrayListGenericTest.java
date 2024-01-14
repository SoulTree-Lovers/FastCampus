package course2.part2.ch2;

import course2.part1.ch2.model.Book;
import java.util.ArrayList;
import java.util.List;

public class ArrayListGenericTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();

        // 제네릭을 사용하지 않으면 Object[] 타입의 배열이 생성되므로, 여러가지 타입을 넣을 수 있다. --> 타입 안정성 x
        list.add(new Book("java", 15000, "한빛", "홍길동"));
        // list.add("Hello"); --> 제네릭 사용 시 에러
        list.add(new Book("python", 15000, "한빛", "홍길동"));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}

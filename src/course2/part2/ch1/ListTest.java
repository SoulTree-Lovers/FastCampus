package course2.part2.ch1;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");

        System.out.println(list.get(0)); // 0번째 원소 출력

        list.remove(1); // 1번째 원소 삭제

        list.set(0, "orange"); // 0번째 원소를 orange로 변경

        for (String s: list) {
            System.out.println(s);
        }
    }
}

package course2.part2.ch1;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("banana"); // --> 중복 x

        System.out.println(set.size());

        for (String s: set) {
            System.out.println(s);
        }

        set.remove("banana"); // banana 원소 삭제

        for (String s: set) {
            System.out.println(s);
        }

        System.out.println(set.contains("cherry")); // cherry가 포함되어 있는지 확인

        set.clear(); // set 비우기

        System.out.println(set.isEmpty()); // set이 비어있는지 확인
    }
}

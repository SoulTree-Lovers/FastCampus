package course2.part2.ch2;

import course2.part2.ch2.model.Pair;
import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        // 제네릭 멀티 타입 파라미터
        Pair<String, Integer> pair = new Pair<>("hello", 1);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        // 검색을 빠르게 할 수 있는 자료구조
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));

    }
}

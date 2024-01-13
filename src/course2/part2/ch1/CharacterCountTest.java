package course2.part2.ch1;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountTest {
    public static void main(String[] args) {
        String str = "Hello World";

        Map<Character, Integer> charCounts =new HashMap<>();

        char[] strCharArray = str.toCharArray(); // 문자열을 char 단위로 나누기

        for (char c : strCharArray) {
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        // 각 문자의 개수 출력
        for (char c : charCounts.keySet()) {
            System.out.println(c + " : " + charCounts.get(c));
        }

    }
}

package course2.part2.ch1;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kim", 95);
        scores.put("Lee", 85);
        scores.put("Park", 90);
        scores.put("Kang", 100);

        System.out.println("Kim's score: " + scores.get("Kim"));
        System.out.println("Lee's score: " + scores.get("Lee"));
        System.out.println("Park's score: " + scores.get("Park"));
        System.out.println("Kang's score: " + scores.get("Kang"));

        scores.put("Park", 80); // Park의 점수 수정
        System.out.println("Park's score: " + scores.get("Park"));

        scores.remove("Lee"); // Lee 정보 삭제
        System.out.println("Lee's score: " + scores.get("Lee"));

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

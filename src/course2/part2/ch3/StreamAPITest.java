package course2.part2.ch3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        // 배열에 들어있는 짝수의 합 구하기
        int[] numbers = {1, 2, 3, 4, 5};

        /* 기존 방식

        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);*/

        // 스트림 방식
        int sum = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println(sum);
    }
}

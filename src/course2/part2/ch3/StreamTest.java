package course2.part2.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = n -> n % 2 == 0; // Predicate는 자바 내장 함수형 인터페이스 (boolean 반환)

        // 짝수만 뽑아서 정렬 후, 제곱 합을 구하기
        int sumOfSquares = numbers.stream()
                .filter(StreamTest::isEven) // .filter(isEven)도 가능 ! --> 위에서 구현한 람다 함수
                .sorted()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(sumOfSquares);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

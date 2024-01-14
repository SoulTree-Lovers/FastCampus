package course2.part2.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamTest2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "orange");

        List<String> upperWords = words.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("upperWords = " + upperWords);
    }
}

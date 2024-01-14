package course2.part2.ch2;

import course2.part2.ch2.model.AverageCalculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};

        AverageCalculator<Integer> integerAverageCalculator = new AverageCalculator<>(integers);
        System.out.println(integerAverageCalculator.average());

        AverageCalculator<Double> doubleAverageCalculator = new AverageCalculator<>(doubles);
        System.out.println(doubleAverageCalculator.average());
    }
}

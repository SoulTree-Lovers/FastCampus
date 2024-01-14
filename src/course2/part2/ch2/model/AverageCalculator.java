package course2.part2.ch2.model;

public class AverageCalculator<T extends Number> { // Number 혹은 Number의 자식 클래스만 선언 가능
    private T[] numbers;

    public AverageCalculator(T[] numbers) {
        this.numbers = numbers;
    }

    public double average() {
        double sum = 0.0;

        for (T number : numbers) {
            sum += number.doubleValue();
        }

        return sum / numbers.length;
    }
}

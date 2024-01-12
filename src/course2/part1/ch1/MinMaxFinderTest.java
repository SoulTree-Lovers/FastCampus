package course2.part1.ch1;

import course2.part1.ch1.model.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7};

        System.out.println("min = " + MinMaxFinder.findMin(array));
        System.out.println("max = " + MinMaxFinder.findMax(array));
    }
}

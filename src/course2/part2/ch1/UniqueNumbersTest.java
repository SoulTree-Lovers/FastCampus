package course2.part2.ch1;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbersTest {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2,4,6,7,1,3};

        Set<Integer> set = new HashSet<>();

        for (int number : nums) {
            set.add(number);
        }

        for (int number : set) {
            System.out.println(number); // unique number 출력
        }
    }
}

package course2.part1.ch1;

import java.util.Random;

public class RandomAPITest {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[6];

        int i = 0;

        while (i < 6) {
            int num = random.nextInt(45) + 1;
            boolean isDuplicate = false;

            for (int j=0; j<i; j++) {
                if (array[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                array[i] = num;
                i++;
            }
        }

        for (int arr: array) {
            System.out.println(arr);
        }

    }
}

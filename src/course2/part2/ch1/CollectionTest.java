package course2.part2.ch1;

import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args) {
        // ArrayList에 10,20,30,40,50 5개의 정수를 저장하고 출력
        // ArrayList -> Object[] <--X-- int
        // ArrayList -> Object[] <--O-- Integer (Wrapper)
        // int형은 기본 자료형이기 때문에, ArrayList에 넣을 수 없으므로 Integer Wrapper를 사용하여 넣어야 한다.

        // ArrayList<int> nums = new ArrayList<int>(); --> error
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10); // Integer <--(Auto Boxing)-- int
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        for (int i: nums) { // int <--(Auto Unboxing)-- Integer
            System.out.println(i);
        }
    }
}

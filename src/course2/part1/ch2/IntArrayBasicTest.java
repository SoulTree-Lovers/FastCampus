package course2.part1.ch2;

public class IntArrayBasicTest {
    public static void main(String[] args) {
        // 정수 5개를 배열에 저장하고 출력
        int[] nums = new int[5]; // 고정 길이 --> 단점..! --> 가변 길이로 못 바꾸나 ?

        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 7;
        nums[4] = 9;

        for (int i=0; i< nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}

package course2.part1.ch2;

import course2.part1.ch2.model.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {
        // 정수 3개를 배열에 저장하고 출력
        IntArray array = new IntArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));

        System.out.println(array.size());
    }
}

package course2.part1.ch2.model;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY = 5;
    private int[] array;
    private int size = 0;

    // 배열 생성하기
    public IntArray() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    // 값 저장하기
    public void add(int element) {
        // 크기 체크
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = element;
    }

    private void ensureCapacity() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }

    // 값 가져오기
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    // 배열 크기 가져오기
    public int size() {
        return size;
    }

}

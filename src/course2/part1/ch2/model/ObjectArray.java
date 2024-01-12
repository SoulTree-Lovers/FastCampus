package course2.part1.ch2.model;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] array;
    private int size = 0;

    // 배열 생성하기
    public ObjectArray() {
//        this.array = new Object[DEFAULT_CAPACITY];
        this(DEFAULT_CAPACITY); // this(): 생성자 안에서 다른 생성자를 호출
    }

    public ObjectArray(int capacity) {
        this.array = new Object[capacity]; // 원하는 크기의 초기 배열 생성
    }

    // 값 저장하기
    public void add(Object element) {
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
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 초과하였습니다.");
        }
        return array[index];
    }

    // 배열 크기 가져오기
    public int size() {
        return size;
    }

}

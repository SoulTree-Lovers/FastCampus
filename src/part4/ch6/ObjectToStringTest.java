package part4.ch6;

import part4.ch6.model.Board;

public class ObjectToStringTest {
    public static void main(String[] args) {
        Board board = new Board();
        board.setTitle("게시글");

        System.out.println(board.toString()); // Object의 toString(): 객체가 저장된 번지 출력 - part4.ch6.model.Board@7a81197d
    }
}

package part3.ch4;

import part3.ch4.model.MovieDTO;

public class BestDTOModeling {
    public static void main(String[] args) {
        // Q. 완전한 형태로 생성된 Movie 클래스를 사용해보자.
        MovieDTO m1 = new MovieDTO("아바타", 20221214, "제이크 설리", "액션", 192.0f, 12);

        System.out.println(m1);
    }
}

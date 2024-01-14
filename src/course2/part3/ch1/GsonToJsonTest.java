package course2.part3.ch1;

import com.google.gson.Gson;
import course2.part3.ch1.model.Member;

public class GsonToJsonTest {
    public static void main(String[] args) {
        Member member = new Member("강승민", 25, "email@naver.com");

        Gson gson = new Gson();

        // Member -> Json String으로 변환
        String json = gson.toJson(member);
        System.out.println("json = " + json);

        // Json String -> Member로 변환
        Member member1 = gson.fromJson(json, Member.class);

        System.out.println("member1 = " + member1);
    }
}

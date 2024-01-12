package course2.part1.ch1;

import com.google.gson.Gson;
import course2.part1.ch1.model.PersonNew;

public class GsonToAPITest {
    public static void main(String[] args) {
        PersonNew p1 = new PersonNew("강승민", 25);

        Gson gson = new Gson();

        String json = gson.toJson(p1);

        System.out.println(json); // json: {"name":"강승민","age":25}
    }
}

package course2.part1.ch1;

import com.google.gson.Gson;
import course2.part1.ch1.model.PersonNew;

public class GsonFromAPITest {
    public static void main(String[] args) {
        String json = "{\"name\":\"강승민\",\"age\":25}";

        Gson gson = new Gson();

        PersonNew p1 = gson.fromJson(json, PersonNew.class);

        System.out.println(p1);
    }
}

package course2.part3.ch1;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAPITest {
    public static void main(String[] args) {
        String apiKey = "1f93c0ee5ae2f856458957adf3c78551";
        String city = "Seoul";
        String urlString =
                "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric\n";

        try {
            URL url = new URL(urlString); // 잘못된 url인 경우 에러

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode(); // 200이면 정상
            if (responseCode == 200) {
                // 스트림(입출력) 연결
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();

                while ((inputLine = bufferedReader.readLine()) != null) {
                    content.append(inputLine);
                }
                bufferedReader.close();
                System.out.println("content = " + content);

                // Json에서 temp 데이터 가져오기
                JsonObject weather = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject main = weather.getAsJsonObject("main");
                double temp = main.get("temp").getAsDouble();
                System.out.println("temp = " + temp);
                connection.disconnect();
            } else {
                // 잘못된 응답
                System.out.println("responseCode = " + responseCode);
                System.out.println("에러가 발생하였습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

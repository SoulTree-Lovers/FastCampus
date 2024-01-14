package course2.part3.ch1;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
    public static void main(String[] args) {
        String url = "https://sum.su.or.kr:8888/bible/today";
//        String url = "https://sum.su.or.kr:8888/bible/today?base_de=2023-03-20"; --> 날짜를 지정하여 가져오기

        try { //  connect().get()의 예외처리를 해야 한다.
            Document document = Jsoup.connect(url).get();

            Element bibleText = document.getElementById("bible_text");
            Element bibleinfoBox = document.getElementById("bibleinfo_box");

            System.out.println("bibleText = " + bibleText.text());
            System.out.println("bibleinfoBox = " + bibleinfoBox.text());

            Elements num = document.select(".num");
            Elements info = document.select(".info");

            for (int i=0; i< num.size(); i++) {
                System.out.println(num.get(i).text() + " : " + info.get(i).text());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

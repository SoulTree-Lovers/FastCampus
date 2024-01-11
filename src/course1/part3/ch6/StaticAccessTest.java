package part3.ch6;

import part3.ch6.model.MyUtil;

public class StaticAccessTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int result = MyUtil.sum(a, b);

        System.out.println(result);
    }
}

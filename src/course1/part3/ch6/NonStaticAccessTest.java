package course1.part3.ch6;

import course1.part3.ch6.model.MyUtil;

public class NonStaticAccessTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        MyUtil myUtil = new MyUtil();

        int result = myUtil.sum2(a, b);

        System.out.println(result);
    }
}

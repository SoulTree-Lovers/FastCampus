package course2.part1.ch3;

public class StringManipulation {
    public static void main(String[] args) {
        // HelloWorld 문자열 생성 및 조작
        String str = "HelloWorld";

        // chatAt(index): index에 해당하는 문자 하나 가져오기
        char c = str.charAt(0);
        System.out.println(c);

        // replaceAll(a, b): a를 b로 변경하기
        String replacedStr = str.replaceAll("o", "X");
        System.out.println(replacedStr);

        // length(): 문자열 길이 가져오기
        int len = str.length();
        System.out.println(len);

        // toUpperCase(): 문자열을 모두 대문자로 변경하기
        String upperStr = str.toUpperCase();
        System.out.println(upperStr);

        // toLowerCase(): 문자열을 모두 소문자로 변경하기
        String lowerStr = str.toLowerCase();
        System.out.println(lowerStr);

        // subString(index): 문자열의 index 부분부터 끝까지 가져오기
        String subStr = str.substring(5);
        System.out.println(subStr);

        // subString(a, b): 문자열의 a 부분부터 b-1까지 가져오기
        String subStr2 = str.substring(5, 8);
        System.out.println(subStr2);

        // indexOf(string): 문자열 내에서 string의 index를 가져오기
        int indexStr = str.indexOf("Wo");
        System.out.println(indexStr);
    }
}

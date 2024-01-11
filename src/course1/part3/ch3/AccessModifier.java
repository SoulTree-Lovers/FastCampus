package part3.ch3;

import part3.ch3.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.name = "강승민";
        // memberDTO.age = 1000; 접근 불가능
        memberDTO.phone = "010-1234-1234";

        System.out.println(memberDTO.name + "\t" + memberDTO.phone);
        memberDTO.play();
    }
}

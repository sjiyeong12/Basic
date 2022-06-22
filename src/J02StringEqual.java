import java.util.Scanner;

public class J02StringEqual {
    public static void main(String[] args) {
        String id = "admin";
        System.out.println("ID를 입력하세요");
        String input = new Scanner(System.in).nextLine();
        if (input.equals(id)) {
            System.out.println("일치합니다.");
        } else {
            System.out.println("일치하지 않습니다.");
        }
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2) ? "같아요" : "달라요");

        String str3 ="abc";
        String str4 ="abc";
        System.out.println(str1.hashCode());//주소값번호앎
        System.identityHashCode(str1);
        System.identityHashCode(str2);
        System.out.println(str3==str4 ? "같아요" : "달라요");
        //주소값을 가져온건 equals만 가능
        //하지만 위는 ==도 가능
    }
}

package javalang;

import java.util.Arrays;
import java.util.StringJoiner;

public class _02_String {
    public static void main(String[] args) {
        String str2 = "Hello"; // constant Pool의 주소를 직접 가리킴
        String str = new String("Hello"); //인스턴스 생성 후 주소 가리킴
        for (int i = 0; i < str.length(); i++) { //배열은 length가 속성. 하지만 문자열은 length가 메서드()임
            System.out.println(str.charAt(i));
        }
        System.out.println(str.compareTo("Aello")); //아스키코드로 대문자 H와 -32차이남
        System.out.println(str.concat(" World")); //합쳐짐. but concat을 했지만 str에는 반영이 안됨. str은 아직 Hello임
        System.out.println(str.contains("Hell")); //문자열 포함 여부 확인
        System.out.println(str.endsWith("lo")); //lo 로 끝남
        System.out.println(str.equalsIgnoreCase("hELlO")); //대소문자 구분 없이 비교
        System.out.println(str.indexOf("ll")); //ll은 두번째 있음 (0부터 시작!)
        System.out.println(str.indexOf('l',3)); //ll은 두번째 있음 (0부터 시작!)
        System.out.println(str.lastIndexOf("ll")); //ll은 두번째 있음 (0부터 시작!)
        System.out.println(str.intern() == str2.intern()); //
        System.out.println(str.replace("l", "k"));
        System.out.println(str.replaceAll("l", "k"));
        System.out.println(str.replaceFirst("l", "k"));
        

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(str.startsWith("He"));
        System.out.println(str.substring(0,3));
        System.out.println(str.toUpperCase()); //모두 대문자
        System.out.println(str.toLowerCase()); //모두 소문자
        System.out.println("            blank     banksy          ".trim()); //앞의 공백 제외
        System.out.println("            blank     banksy          ".replace(" ", "")); //공백없애기
        System.out.println(String.valueOf(0010)); //8진수
        System.out.println(String.valueOf(0x10)); //16진수
        System.out.println(String.valueOf(0b10)); //2진수
        System.out.println(String.valueOf(true)); 
        StringJoiner sj = new StringJoiner("/","[","]"); // 자바 유틸.패키지
        for(String s: arr)sj.add(s);
        System.out.println(sj.toString());
    }
}

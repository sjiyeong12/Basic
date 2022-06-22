import java.util.Scanner;

import javax.swing.JOptionPane;

public class InputEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Scanner의 메소드들은 데이터를 입력한 후 엔터를 누르면 동작하도록 되어있다.
        System.out.print("당신의 이름을 입력하세요 : ");
        String input = s.nextLine();
        //nextLine : 엔터를 치기 전까지 쓴 문자열을 모두 리턴!
        //next : 스페이스(즉, 공백) 전까지 입력받은 문자열을 리턴!
        System.out.println(input + "님 환영합니다.");

        input = JOptionPane.showInputDialog(null, "당신의 이름을 입력하세요");
            //JOptionPane : 표준대화상자를 팝업해서 이용할 수 있게 해줌
            //showInputDialog : 사용자에게 직접 입력을 받아올 수 있음. 
                //showInputDialog는 크게 2종류가 있다. 키보드입력 + ok버튼 누르기 or 옵션 클릭하고 ok버튼 누르기 
            //parentComponent : 주로 null값이 들어감. 부모 컴포넌트를 지정해서 팝업 활성화 제어
            //massage : 팝업상자에 표시될 내용
        System.out.println(input + "님을 격하게 환영합니다.");
        System.out.println(true+""+null);

    }
}

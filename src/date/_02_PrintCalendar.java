package date;

import java.util.Calendar;
import java.util.Scanner;

public class _02_PrintCalendar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("달력 출력 프로그램입니다. (종료는 q,Q)");
        do{
        System.out.print("원하는 달력의 연도와 월을 입력하시오(ex 2022 06)");
        String input = s.nextLine();
        String[] arr = input.split(" ");
        if(input.equalsIgnoreCase("q")){System.out.println("Bye");System.exit(-1);}
        if(arr.length != 2){
            System.out.println("연도와 월을 양식에 맞춰서 입력하세요(예 2022 06)");
            continue;
        }

        int year = 0;
        int month = 0;
        try{
            year=Integer.parseInt(arr[0]);
            month=Integer.parseInt(arr[1]);
        } catch(Exception e){
            System.out.println("연도와 월을 양식에 맞춰서 입력하세요(예 2022 06)");
            continue;
        }

        Calendar startD = Calendar.getInstance();
        Calendar endD = Calendar.getInstance();
        startDay.set(year, month-1, 1);
        endDay.set(year,month,1);
        endDay.add(Calendar.DATE, -1);



    } while (true);
}
}
package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _03_timepackage {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); //로컬날짜클래스. 날짜정보만 필요할 때 사용
        System.out.println(date); //date : 현재 날짜 
        LocalDate localDate = date.of(2100, 6, 1);
        localDate.plus(1,ChronoUnit.DAYS);
        localDate.plusDays(1);
        localDate.minusDays(1);
        System.out.println(localDate);

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime localTime = LocalTime.of(12, 00, 00);
        System.out.println(localTime);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        ldt = LocalDateTime.of(date, time);
        System.out.println(ldt);
    }
}

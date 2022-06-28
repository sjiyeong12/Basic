package date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Exercise10_1 {
    public static void main(String[] args) {
        LocalDate ld;
        for (int i = 1; i <= 12; i++) {
            ld = LocalDate.of(2020,i,1);
            ld = ld.with(ChronoField.ALIGNED_WEEK_OF_MONTH,2); //2번째주
            ld = ld.with(ChronoField.DAY_OF_WEEK,7); //요일. Localdate는 1이 월요일 7이 일요일
            System.out.println(ld+"/"+ld.getDayOfWeek());
            System.out.println(ld+"/"+ld.getDayOfWeek().getValue());
            System.out.println(ld+"은 2번째 일요일입니다.");
        }

        //요일이 7보다크고 14보다 작은
    }
}

package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _04_SimpleDate {
    public static void main(String[] args) {
        Date d=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss"); //날짜 형식
        System.out.println(sdf.format(d));
    }
}

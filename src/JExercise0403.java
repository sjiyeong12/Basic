import javax.sql.rowset.spi.SyncResolver;

public class JExercise0403 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for ( int j = 0; j < i; j++) {
                sum += j+1;
            }
        }
        System.out.println(sum);
    }
}

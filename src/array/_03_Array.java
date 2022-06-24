package array;
import java.util.Arrays;

public class _03_Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;
        int max = arr[0];
        int min = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*arr.length) +1;
            total += arr[i];
            if(arr[i] > max){
                max = arr[i];
            } else if(arr[i]<min){
                min = arr[i];
            }
        }
        

        System.out.println(min);
        System.out.println(Arrays.toString(arr));
        System.out.printf("합: %d 평균: %4.2f", total, (float)total/arr.length);
        System.out.printf("최대값 :%d, 최소값:%d",max,min);
    }
}

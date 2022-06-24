package object;
import java.util.Arrays;

public class Exercise6_17 {
    
    static void shuffle(int[] arr){
            
            for (int i = 0; i < arr.length; i++) {
              int rand = (int) (Math.random() * arr.length);
              int tmp = arr[i];
              arr[i] = arr[rand];
              arr[rand] = tmp;
            }
            System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));
        shuffle(original);
        // int[] result = shuffle(original);
        // System.out.println(java.util.Arrays.toString(result));
    }
}

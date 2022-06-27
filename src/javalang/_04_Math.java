package javalang;

import java.util.Arrays;

public class _04_Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(10.1)); // 절상
        System.out.println(Math.floor(10.8)); // 절삭
        System.out.println(Math.round(10.5)); // 반올림
        System.out.println(Math.max(-1.4, -1.2));
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, arr[i + 1]);
        }
        System.out.println(max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println(min);
        System.out.println(Math.rint(1.2));
        System.out.println(Math.rint(-1.7));
        System.out.println(Math.round(-1.7));
        System.out.println(Math.rint(-1.2));
        System.out.println(Math.round(-1.2));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.rint(4.5));

        Object obj = Integer.valueOf(10);
        Integer i1 = Integer.valueOf(10);
        System.out.println(obj == i1);
        int i2 = (int) obj;
        int i3 = i1;

        System.out.println(Integer.parseInt("1010", 2)); // 기본형 int로 변환
        System.out.println(Integer.parseInt("1010", 8));
        System.out.println(Integer.parseInt("1010", 16));

        System.out.println(Integer.valueOf("1010", 2)); // parseint와 값은 같지만 래퍼클래스
        System.out.println(Integer.valueOf("1010", 8)); // parseint와 값은 같지만 래퍼클래스
        System.out.println(Integer.valueOf("1010", 16)); // parseint와 값은 같지만 래퍼클래스

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

        int num = Integer.parseInt("10"); //참조형 =>일반형 Unboxing
        Integer i4 = Integer.valueOf("10"); //참조형=>참조형
        Integer i5 = 10; //일반형 =>참조형 Autoboxing


        //Autoboxing과 Unboxing은 암묵적으로 처리됨
        Object[] objs = new Object[5];
        objs[0] = true;
        objs[1] = new Object(){};
        objs[2] = 10;
        objs[3] = Integer.valueOf(10);
        System.out.println(objs[2]);
        System.out.println(Integer.valueOf(10));
    }
}
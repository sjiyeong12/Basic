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
arr[i] = (int)(Math.random()*100) + 1;
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
Integer il = Integer.valueOf(10);
System.out.println(obj == il);
int i2 = (int) obj;
int i3 = i1;

System.out.println(Integer.parseInt("10",2));
}
}
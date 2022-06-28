package collection;

import java.util.Set;
import java.util.TreeSet;

public class _05_TreeSet {
    public static void main(String[] args) {
        Set lotto = new TreeSet();
        while(lotto.size()<7){
        int ball = (int)(Math.random()*45)+1;
        lotto.add(ball);
        }
        System.out.println(lotto);
    }
}

class Ball{
    int num;
    String color;
}
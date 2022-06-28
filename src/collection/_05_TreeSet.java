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


        Set set = new TreeSet();
        Ball[] balls = new Ball[5];
        int[] nums = {4,2,1,5,3};
        String[] colors = {"red", "yellow", "black", "pink", "green"};
        Ball ball1 = new Ball(5,"Red");
        Ball ball2 = new Ball(5,"Red");
        Ball ball3 = new Ball(5,"Red");
        Ball ball4 = new Ball(5,"Red");
        Ball ball5 = new Ball(5,"Red");
    }
}

class Ball{
    int num;
    String color;
    public Ball(int num, String color){
        this.num=num;
        this.color=color;
    }

}
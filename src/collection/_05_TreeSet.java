package collection;

import java.util.Objects;
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
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Ball(nums[i],colors[i]);
            set.add(balls[i]);
        }
        System.out.println(set);

        // Ball ball1 = new Ball(5,"Red"); //이게 위와 같음(20행)
        // Ball ball2 = new Ball(5,"Red");
        // Ball ball3 = new Ball(5,"Red");
        // Ball ball4 = new Ball(5,"Red");
        // Ball ball5 = new Ball(5,"Red");
    }
}

class Ball implements Comparable { //Comparable은 타입이 인터페이스이다. 이 추상메서드를 정의해야함
    //comaprable - compareto()
    //comparator - compare()
    int num;
    String color;
    public Ball(int num, String color){
        this.num=num;
        this.color=color;
    }
    @Override
    public int compareTo(Object o) {
        Ball tmp = (Ball) o;
        // if(tmp.num<num)return 1;
        // else if(tmp.num==num) return 0;
        // else return -1;
        return -(tmp.color.compareTo(color));
        
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ball)) return false; 
            Ball tmp = (Ball)obj;
            return tmp.num==(num) && tmp.color.equals(color);
         }  
    @Override
    public int hashCode() {
        return Objects.hash(num, color);
    }
    @Override
    public String toString() {
        return num+"["+color+"]";
    }
}
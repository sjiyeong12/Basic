package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _03_set {
    public static void main(String[] args) {
        Set set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(2);
        set.add(3);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()+",");
        }
        System.out.println();
        Set lotto = new HashSet<>();
        while(lotto.size()<7){
            int ball = (int)(Math.random()*45) +1;
            lotto.add(ball);
        }
        System.out.println(lotto);
    }
}

package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class _01_List {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(new Date());
        a1.add("hello");
        a1.add(true);
        a1.add(1);
        a1.clear();
        ArrayList<Integer> list = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        int total = 0;
        // for(Object i : list){ //list를 만들 때<Interger>라고 선언하게 되면 object 대신 int를 넣어도 됨
        for(int i : list){
            // total += (int)i; //list를 만들 때<Interger>라고 선언하게 되면 int를 없애도 됨
            total += (int)i;

        }
        total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += (int) list.get(i); //형변환 없이 generics타입으로 연산가능
        }
        System.out.println(total);
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List list2 = new ArrayList();
        list2 = new ArrayList<>();
    }
}

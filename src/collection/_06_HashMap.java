package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _06_HashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("admin", "1234");
        map.put("user", "1234");
        map.put("admin", "1111");
        System.out.println(map);
        Iterator it = map.entrySet().iterator(); //key, value 모두 불러올 때



        while(it.hasNext()){ //entry로 불러올 때
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        it = map. keySet().iterator(); //key만 불러올 때
        while(it.hasNext()){ 
            String id = (String) it.next();
            System.out.println(id+":"+map.get(id));
        }

        it = map.values().iterator();
        while(it.hasNext()){
            String value = (String) it.next();
            System.out.println(value);
        }
    }
}

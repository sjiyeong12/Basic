package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _07_HashMap {
    static HashMap phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addPhoneNo("친구","강길동","010-1111-1111");
        addPhoneNo("친구","감길동","010-1111-1111");
        addPhoneNo("회사","이길동","010-1111-1111");
        addPhoneNo("회사","동길동","010-1111-1111");
        addPhoneNo("회사","박길동","010-1111-1111");
        addPhoneNo("세탁","051-111-1111");
        printList();

        // Map members = new HashMap<>();
        // Map rooms = new HashMap<>();
        // members.put("1", new Member("1", "a", "김길동"));
        // members.put("2", new Member("2", "a", "강길동"));
        // members.put("3", new Member("3", "a", "고길동"));
        // members.put("4", new Member("4", "a", "박길동"));
        // members.put("5", new Member("5", "a", "홍길동"));


        // rooms.put("1no", new HashMap<>());
    }

    private static void printList(){
        // Set set = phoneBook.entrySet();
        // Iterator it = set.iterator();
        Iterator it = phoneBook.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();
            System.out.println(" * "+e.getValue()+"["+subSet.size());
        }
    }

    static void addPhoneNo(String groupName, String name, String tel){
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name);
    }
    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName)) phoneBook.put(groupName,new HashMap<>());
    }
    static void addPhoneNo(String name, String tel){
        addPhoneNo("기타", name, tel);
    }
}

class Member{
    String id;
    String pw;
    String name;
    public Member(String id, String pw, String name){
        this.id=id;
        this.pw=pw;
        this.name=name;
    }
}

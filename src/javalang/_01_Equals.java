package javalang;

public class _01_Equals {
    public static void main(String[] args) {
       Value v1 = new Value(10); //new를 만나면 새로운 주소가 생성되면서 인스턴스가 된다
       Value v2 = new Value(10);
       System.out.println(v1.hashCode());
       System.out.println(v2.hashCode());
       System.out.println(v1==v2); //hashcode를 비교함 
       System.out.println(v1.equals(v2));
    }
}

class Value {
    int val;
    Value(int val){
        this.val = val;
    }

@Override
public boolean equals(Object obj){

    if(obj instanceof Value){
        Value tmp = (Value) obj; //자부자 반드시 명시적 형변환
        return val == tmp.val;
    }
    return false;
}

}
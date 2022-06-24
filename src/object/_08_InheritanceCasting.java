package object;

import java.lang.reflect.Method;

public class _08_InheritanceCasting {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child(); //인스턴스생성
        System.out.println((child instanceof Parent)?"상속관계":"비상속관계");
        System.out.println((child instanceof Object)?"상속관계":"비상속관계");
        System.out.println((parent instanceof Object)?"상속관계":"비상속관계");
        System.out.println((parent instanceof Child)?"상속관계":"비상속관계");
        // System.out.println((child instanceof Firebat)?"상속관계":"비상속관계");
        // Child c1 = (Child)new Parent(); // 형변환 부모 = > 자식; 원칙적으로 안됨 
        Parent p1 = new Child(); // 형변환 자식 = > 부모 (o)
        Child c2 = (Child)p1; //형변환 자 => 부 => 자 됨. (o)
        System.out.println(p1.age); //상속관계의 형변환시 속성은 부모꺼 사용.
        p1.eat(); //상속관계의 형변환시 메서드는 자식꺼 사용.
        System.out.println(c2.age);
        c2.eat(); //자부자일때는 속성은 자식 것을 쓴다
    }
}

class Parent {
    int age = 80;
    String name;
    void eat(){System.out.println("부모가 드세요");}
}

class Child extends Parent {
    int age = 30;
    String name;
    void eat(){System.out.println("자식이 먹어요");}
    String study;
} //생성자와 초기화변수는 상속을 받지 않음.

class Father { int age; }
class Mother { int age; }
// class Child2 extends Faterh, Mother{} <<이렇게는 불가능! 자바는 단일 상속만 가능하기 때문이다.
// 다중 상속을 보완하기 위해서 인터페이스가 나옴
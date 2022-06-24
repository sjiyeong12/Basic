package object;

public class _10_Interface {
    public static void main(String[] args) {
    }
}

class Mammals {

}

class Birds {

}

class Lion extends Mammals implements Groundable {} 
class Rabbit extends Mammals implements Groundable  {} 
class Bat extends Mammals implements Flyable{
    @Override
    public void fly() {
        System.out.println("batbat~~~!");
        
    }
} 
class Eagle extends Birds implements Flyable{
    @Override
    public void fly() {
       System.out.println("eagleelgle~~~!");
        
    }
}
class Penguin extends Birds implements Groundable, Swimmable {}
class Crow extends Birds implements Flyable{
    @Override
    public void fly() {
        System.out.println("crowcrow~~~!");
    }
}
interface Flyable { //자바는 다중상속을 못하기 때문에 class 대신 interface를 준다. interface는 다중으로 가능
    //interface는 추상메서드 + 상수
    public abstract void fly(); //보통같으면 fly(){}를 써줘야하지만, interface는 저렇게 해도 됨. 나중에 오버라이드를 하기 때문
}
interface Groundable {
}
interface Swimmable{
}

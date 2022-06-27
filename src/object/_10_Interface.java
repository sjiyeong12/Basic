package object;

public class _10_Interface {
  public static void main(String[] args) {
    Mammals mammals[] = new Mammals[]{new Lion(), new Rabbit(), new Bat()};
    Birds birds[] = new Birds[]{new Eagle(), new Penguin(), new Crow()};
    Flyable flyable[] = new Flyable[]{new Eagle(),new Crow(), new Bat() };
    Groundable groundable[]=new Groundable[]{new Lion(),new Rabbit(),new Penguin()};

    Flyable flyable2 = new Flyable(){  //Anonymous Object 익명객체
      @Override
      public void fly() { }
    };

    for (int i = 0; i < flyable.length; i++) {
      flyable[i].fly();
      //interface를 implement한 클래스는 그 클래스의 메서드와 멤버변수를 직접 사용안됨.
      //implement 하고 재정의한 메서드에서 메서드와 멤버변수를 사용가능하다.
      //단일상속의 문제점을 interface로 보완가능하다.
      // System.out.println( flyable[i].name); 
    }
    for (int i = 0; i < mammals.length; i++) {
      System.out.println( mammals[i].name);
    }
  }
}

class Mammals { 
  String name; 
  public Mammals(String name) {
    this.name = name;
  }
}
class Birds { 
  String name; 
  public Birds(String name) {
    this.name = name;
  }
}
class Lion extends Mammals implements Groundable {
  public Lion(){
    super("사자");
  }
  String siksung = "육식";
}
class Rabbit extends Mammals implements Groundable {
  public Rabbit(){
    super("토끼");
  }
}
class Bat extends Mammals implements Flyable {
  public Bat(){
    super("박쥐");
  }
  @Override
  public void fly() {
    System.out.println(super.name+" batbat~~~!");
  }
}
class Eagle extends Birds implements Flyable {
  public Eagle(){
    super("독수리");
  }
  String baltop = "발톱";
  @Override
  public void fly() {
    System.out.println(super.name+"eagleeagle~~~!"+baltop);
  }
}
class Penguin extends Birds implements Groundable, Swimmable {
  public Penguin(){
    super("펭귄");
  }

}
class Crow extends Birds implements Flyable {
  public Crow(){
    super("까마귀");
  }
@Override
  public void fly() {
    System.out.println("crowcrow~~~!");
  }
}
interface Flyable { 
  public abstract void fly();
}
interface Groundable { }
interface Swimmable { }
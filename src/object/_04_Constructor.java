package object;

public class _04_Constructor {
  public static void main(String[] args) {
    Foo foo = new Foo("곰돌이","꿀");
    Foo foo2 = new Foo();
  }
}

class Foo {
  private String name;
  private String like;
  // 기본 생성자 Constructor
  public Foo(){ 
    this("곰돌이 푸", "꿀"); //default 값 지정
  }
  public Foo(String name, String like){ //매개변수가 있는 생성자
    this.name = name; this.like = like;
  }
}
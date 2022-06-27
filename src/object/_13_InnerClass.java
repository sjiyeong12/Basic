package object;

public class _13_InnerClass {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.InstanceInner oi = outer.new InstanceInner();
    outer.myMethod(); //400
    System.out.println(oi.iv); //100
    Outer.StaticInner os = new Outer.StaticInner();
    System.out.println(os.iv); //200
  }
}

class Outer{
  class InstanceInner {
    int iv = 100;
  }
  static class StaticInner {
    int iv = 200;
    static int sv = 300;
  }
  void myMethod(){
    class LocalInner {
      int iv = 400;
    }
    System.out.println(new LocalInner().iv);
  }
}
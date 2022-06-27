package object;

class Outer{
    class Inner {
        int iv = 100;
    }
}

class Exercise7_6 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();

        System.out.println(in.iv);
    }
}

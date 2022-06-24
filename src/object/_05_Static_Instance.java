package object;

public class _05_Static_Instance {
  public static void main(String[] args) {
    Marine m1 = new Marine();
    Marine m2 = new Marine();
    Marine m3 = new Marine();
    m1.setAttackLv(8);
    // m2.setAttackLv(8);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
  }
}

class Marine {
  private int hp;
  static private int attackLv = 6;

  static String info(){
    // return toString();//instance 메서드
    return "Marine["+attackLv+"]";
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getAttackLv() {
    return this.attackLv;
  }

  public void setAttackLv(int attackLv) {
    this.attackLv = attackLv;
  }
  @Override
  public String toString() {
    // return hp+"/"+attackLv;
    return info();
  }
}
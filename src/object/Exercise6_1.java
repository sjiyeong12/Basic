package object;

public class Exercise6_1 {
  public static void main(String[] args) {
    Student s = new Student("홍길동",1,1, 100,60,76);
    String str = s.info();
    System.out.println(str);
    System.out.println(s.getName());
    System.out.println(s.getTotal());
    System.out.println(s.getAverage());
  }
}
class Student {
  public Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name; this.ban = ban;this.no=no;this.kor=kor;this.eng=eng;
    this.math = math;
  }
  public int getTotal(){return kor+eng+math;}
  public float getAverage(){
    return Math.round(getTotal()/3.0f*10)/10.0f;
  }
  public String info() {
    int total = kor+eng+math;
    // float avg = (int)(total/3.0f*10+0.5)/10.0f;
    float avg = Math.round(total/3.0f*10)/10.0f;
    return name+","+ban+","+no+","+kor+","+eng+","+math+","+total+","+avg;
  }
  private String name;
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
  private int ban;
  private int no;
  private int kor;
  private int eng;
  private int math;
  
}
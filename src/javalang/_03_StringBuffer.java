package javalang;

public class _03_StringBuffer {
public static void main(String[] args) {
String str = "Hello";
System.out.println(str.hashCode()); //인스턴트의 해시코드
System.out.println(System.identityHashCode(str)); //더정밀함
str = str + " World";
System.out.println(str.hashCode());
System.out.println(System.identityHashCode(str));
System.out.println("================================");
StringBuffer sb = new StringBuffer("Hello");
System.out.println(str.hashCode());
System.out.println(System.identityHashCode(sb));
sb.append(" World~! I am your world~!");
System.out.println(sb.capacity());
System.out.println(str.hashCode());
System.out.println(System.identityHashCode(sb));
System.out.println(sb.delete(0,5));
System.out.println(sb.delete(0,1));
System.out.println(sb.toString());
System.out.println(sb.deleteCharAt(5));
System.out.println(sb.insert(0,"Hello "));
// System.out.println(sb.reverse());
sb.setLength(11);
System.out.println(sb);

}
}
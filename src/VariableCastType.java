public class VariableCastType {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;
        byte bHap = (byte)(b1 + b2); //byte, short, char는 연산시 int변환
        int i1 = 100;
        b1 = (byte) i1; //큰범위가 작은범위로 형변환 : 명시적 형변환
        i1 = b1; //작은 범위가 큰범위로 형변환 : 묵시적 형변환
        long l1;
        l1 = i1;
        i1 = (int) l1;
        long total;
        total = i1 + l1;
        int hap;
        hap = (int)(i1 + l1);
        float f1=100.0f;
        total = (long)(l1 + f1);
    }
}

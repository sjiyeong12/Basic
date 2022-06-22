public class VariableCastType {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;
        int bHap = (int)(b1 + b2); 
        int i1 = 100;
        b1 = (byte)i1;
        long l1;
        l1 = i1;
        i1 = (int)l1;
        long total;
        total = i1 + l1;
        int hap;
        // hap = i1 + l1; int가 long보다 작아서 오류가 난다
        hap = (int)(i1 + l1); //명시적 형변환 
        float f1=100.0f; //byte는 long이 float보다 크지만 범위는 float가 더 크다. 
        total = (long)(l1 + f1);
    }
}

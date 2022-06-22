public class JExercise03 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A';

        System.out.println(y >=5 || x<0 && x>2);
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A'<=c && c<='Z'));
        System.out.println('C' - c);
        System.out.println('5' -'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        int num = 456;
        System.out.println(num/100*100);

        int numOfApples = 123; //사과개수
        int sizeOfBusket = 10; //바구니 크기
        int numOfBucket = (int)(Math.ceil((double)numOfApples/sizeOfBusket)); //모든 사과를 담는데 필요한 바구니 수
        numOfBucket = (numOfApples%sizeOfBusket==0?0:1)+numOfApples/sizeOfBusket;

        System.out.println("필요한 바구니의 수 :" +numOfBucket);

        int num2=10;
        System.out.println(num2>0?"양수" :(num2==0?0:"음수"));

        int fahrenheit = 100;
        float celcius = (int)((float)5/9*(fahrenheit-32)*1000+0.5/100)/1000.0f;

    }
}

public class PrintPrintlnPrintf {
    public static void main(String[] args) {
        System.out.print( "h");
        System.out.print("a");
        System.out.println();
        System.out.println( "h");
        System.out.println( "a");
        // System.out.printf("%d%d=%2d",2,1,2*1);
        for(int i = 2; i<10; i++){
            for(int j= 1; j<10; j++){
                System.out.printf( "%d * %d=%2d%n", i,j,i*j);    
            }
            System.out.println();  
        }
        System.out.printf("%c is %s \n", 'A', "Ace");
        //문자열 출력 c = char / s = string

        System.out.printf("%4.2f %n", 1234.56f);
        //실수 출력. f : float ex. 3.2에서 2는 소수점 2자리 수까지. 앞의 3은 소수점포함 전체 자리 수!
        //즉, 전체 3자리 중 소수점아래 2자리!
        System.out.printf("%4.2g %n", 1234.56f);
        System.out.printf("%4.2e %n", 1234.56f);
    }
}


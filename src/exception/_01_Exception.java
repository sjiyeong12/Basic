package exception;

public class _01_Exception {
  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(2);
    try {
      System.out.println(3);
      System.out.println(0/0); //ArithmeticException
      // throw new Exception(); //강제로 예외 발생
      // System.out.println(4);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.out.println(5);
    } catch (Exception e) {
      System.out.println(5);
    } finally {
      System.out.println(6);
    }
    System.out.println(7);
  }
}

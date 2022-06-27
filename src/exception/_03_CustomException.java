package exception;

public class _03_CustomException {
  public static void main(String[] args) {
    try {
      throw new MyException("내가 만든 exception");
    } catch (Exception e) {
      e.printStackTrace();
      try {
        throw new Exception();
        
      } catch (Exception e1) {
        //TODO: handle exception
      }
    }
  }
}

class MyException extends Exception {
  public MyException(String str){
    super(str);
  }
}
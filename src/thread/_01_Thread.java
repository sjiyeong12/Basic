package thread;

public class _01_Thread {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        MyThread t1 = new MyThread();
        t1.start();
        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();
        System.out.println("Main Thread finished");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        try {
        Thread.sleep(1000);
        System.out.println("finished Thread");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // 스레드는 exception을 동반한다 그래서 try catch문을 넣어야함
            System.out.println("finished Runnable");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
    }
}
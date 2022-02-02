package multithreading;

public class CraeteThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread2());
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi i am thread4");
            }
        });

        new Thread(()->{
            System.out.println("new Thread Hi");
        }).start();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println(" Hi i am thread1");
    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println(" Hi i am thread2");
    }
}
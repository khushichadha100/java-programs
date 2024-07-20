class MyRunnable implements Runnable {
    public void run() {
        System.out.println("My name is khushi");
    }
}

class AnotherRunnable implements Runnable {
    public void run() {
        System.out.println("Hello Java");
    }
}

public class twothreadsex{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new AnotherRunnable());
        t1.start();
        t2.start();
    }
}

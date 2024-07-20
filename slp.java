public class slp {
    public static void main(String[] args) {
        System.out.println("Thread started.");
        
        try {
            // Sleep for 5 seconds
            Thread.sleep(5000);
            System.out.println("Thread woke up after sleeping.");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
        
        System.out.println("Thread finished.");
    }
}

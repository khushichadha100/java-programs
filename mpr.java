class mpr extends Thread
{
 public void run()
 {
  System.out.println("Thread is running");
    
  }
  public static void main(String[] args)
  {
    mpr obj1=new mpr();
    obj1.start();
    System.out.println("priority before change: " + obj1.getPriority());
    System.out.println("main thread priority before change: "+ Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(3);
    obj1.setPriority(8);
       System.out.println("main thread priority after change: "+ Thread.currentThread().getPriority());
    System.out.println("priority after change: " + obj1.getPriority());
   }
}
class setpr extends Thread
{
 public void run()
 {
  System.out.println("Thread is running");
   
  }
  public static void main(String[] args)
  {
    setpr obj1=new setpr();
    obj1.start();
    System.out.println("priority before change: " + obj1.getPriority());
    obj1.setPriority(3);
   System.out.println("priority after change: " + obj1.getPriority());
   }
}
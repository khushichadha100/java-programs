class getpr extends Thread
{
 public void run()
 {
  System.out.println("Thread is running");
   
  }
  public static void main(String[] args)
  {
    getpr obj1=new getpr();
    obj1.start();
    System.out.println("thread priority: "+ obj1.getPriority());
   }
}
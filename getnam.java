class getnam extends Thread
{
 public void run()
 {
  System.out.println("Thread is running");
   
  }
  public static void main(String[] args)
  {
    getnam obj1=new getnam();
    obj1.start();
    System.out.println("thread name is: "+ obj1.getName());
    getnam obj2=new getnam();
    obj2.start();
    System.out.println("thread name is: "+ obj2.getName());
    
   }
}
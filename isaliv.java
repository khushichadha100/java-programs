class isaliv extends Thread
{
  public void run() 
  {
    System.out.println("thread is running");
    System.out.println("thread in run : " + Thread.currentThread().isAlive());
   }
 public static void main(String[] args)
 {
   isaliv obj1=new isaliv();
   System.out.println(obj1.isAlive());
   obj1.start();
   System.out.println(obj1.isAlive());
    System.out.println("thread in main : " + Thread.currentThread().isAlive());
 }
}
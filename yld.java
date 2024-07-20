class yld extends Thread
{
  public void run()
  {
    for(int i=1;i<=3;i++)
    {
      System.out.println(Thread.currentThread().getName() + ":" + i);
     }
   }
   public static void main(String[] args)
   {
     yld obj1=new yld();
     obj1.start();
     Thread.yield();
     for(int i=1;i<=3;i++)
    {
      System.out.println(Thread.currentThread().getName() + ":" + i);
     }
   }
}
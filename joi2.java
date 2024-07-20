class joi2 extends Thread
{
  public void run()
  {
    for(int i=1;i<=5;i++)
    {
      System.out.println("child thread " +  i);
     }
   }
   public static void main(String[] args)
   {
     joi2 obj=new joi2();
    obj.start();
    try
    {
      for(int i=1;i<=5;i++)
     {
       System.out.println("main thread " +  i);
       obj.join();
      }
     }
     catch(Exception e)
     {
        System.out.println(e);
      }
   }
}
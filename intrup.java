class intrup extends Thread
{
  public void run()
  {
   try
   {
    for(int i=1;i<=5;i++)
    {
      System.out.println(i);
      Thread.sleep(3000);
     }
    }
    catch(InterruptedException e)
    {
      System.out.println("THREAD IS INTERRUPTED !!" + e);
     }
   }
 public static void main(String[] args)
{
  intrup obj=new intrup();
  obj.start();
  obj.interrupt();
 }
}
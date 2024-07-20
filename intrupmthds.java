class intrupmthds extends Thread
{
  public void run()
  {
    
   System.out.println(Thread.interrupted());
   try
   {
    for(int i=1;i<=5;i++)
    {
      System.out.println(i);
      Thread.sleep(1000);
        
     }
    }
    catch(Exception e)
    {
      System.out.println("THREAD IS INTERRUPTED !!" + e);
     }
   }
 public static void main(String[] args)
{
  intrupmthds obj=new intrupmthds();
  obj.start();
  obj.interrupt();
 }
}
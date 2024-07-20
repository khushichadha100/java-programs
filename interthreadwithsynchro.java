class totalearnings extends Thread
{
  int total=0;
  public void run()
  {
     synchronized(this)
     {
        for(int i=1;i<=10;i++)
       {  
         total=total+100;
       }
        this.notify();
     }
   }
}
class  interthreadwithsynchro
{
  public static void main(String[] args)
  {
    totalearnings te=new totalearnings();
    te.start();
    synchronized(te)
    {
      try
      {
        te.wait();
       }
       catch(InterruptedException e)
       {
         System.out.println(e);
       }
        System.out.println("total earnings : " + te.total + "Rs");
     }
   }
}
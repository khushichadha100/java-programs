class totalearnings extends Thread
{
  int total=0;
  public void run()
  {
     for(int i=1;i<=10;i++)
     {  
        total=total+100;
      }
   }
}
class  interthreadwithoutsynchro
{
  public static void main(String[] args)
  {
    totalearnings te=new totalearnings();
    te.start();
    System.out.println("total earnings : " + te.total + "Rs");
   }
}
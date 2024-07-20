class bookbusseat  
{
  int total_seats=10;
  void bookseat(int seats)
  {
    System.out.println("thread executing : " + Thread.currentThread().getName());
    System.out.println("thread executing : " + Thread.currentThread().getName()); 
   
    synchronized(this)
   { 
         if(total_seats>=seats)
        {
          System.out.println("seats booked");
          total_seats=total_seats-seats;
          System.out.println("remaining seats : " + total_seats);
         }
         else
        {
          System.out.println("seats cant be booked");
          System.out.println("seats left : " + total_seats);
         }
    }
 
     System.out.println("thread executing : " + Thread.currentThread().getName());
     System.out.println("thread executing : " + Thread.currentThread().getName());
    
   }
}
class bookbusseatonline2 extends Thread
{
  static bookbusseat  b;
  int seats;
  public void run()
  {
    b.bookseat(seats);
   }
   public static void main(String[] args)
   {
     b=new bookbusseat();
     bookbusseatonline2 b1=new bookbusseatonline2();
     b1.seats=8;
     b1.start();
     bookbusseatonline2 b2=new bookbusseatonline2();
     b2.seats=5;
     b2.start();
    }
}
class bookbusseat
{
  int total_seats=50;
   synchronized void bookseat(int seats)
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
}
class bookbusseatonline extends Thread
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
     bookbusseatonline b1=new bookbusseatonline();
     b1.seats=45;
     b1.start();
     bookbusseatonline b2=new bookbusseatonline();
     b2.seats=20;
     b2.start();
    }
}
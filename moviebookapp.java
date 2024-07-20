class booktheaterseat
{
  static int total_seats=20;
 static synchronized void bookseat(int seats)
  {
    if(total_seats>=seats)
    {
      System.out.println(seats + "seats booked");
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
class mythread1 extends Thread
{
  static booktheaterseat  b;
   int seats;
  mythread1(booktheaterseat b,int seats)
  {
    this.b=b;
    this.seats=seats;
  }
  public void run()
  {
    
    b.bookseat(seats);
   }
}
class mythread2 extends Thread
{
  static booktheaterseat  b;
   int seats;
   mythread2(booktheaterseat b,int seats)
  {
    this.b=b;
    this.seats=seats;
  }
  public void run()
  {
    
    b.bookseat(seats);
   }
}
class moviebookapp
{
   public static void main(String[] args)
   {
     booktheaterseat b1=new booktheaterseat();
     mythread1 t1=new mythread1(b1,7);
     t1.start();
     mythread2 t2=new mythread2(b1,6);
     t2.start();
     booktheaterseat b2=new booktheaterseat();
     mythread1 t3=new mythread1(b2,5);
     t3.start();
     mythread2 t4=new mythread2(b2,9);
     t4.start();
    }
}
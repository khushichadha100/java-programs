class multithreads extends Thread
{
   public void run()
   {
       System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args)
   {
     for(int i=0;i<=5;i++)
     { 
       multithreads m=new multithreads();
       m.start();
     }
    }
}
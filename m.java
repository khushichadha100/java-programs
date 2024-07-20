class m
{
  public static void main(String[] args)
 {
   System.out.println("hello");
   System.out.println("current thread => "+ Thread.currentThread());
    System.out.println("name of current thread => "+ Thread.currentThread().getName());
   Thread.currentThread().setName("khushimain");
   System.out.println("name after changing => "+ Thread.currentThread().getName());
   System.out.println("main thread priority => "+ Thread.currentThread().getPriority());
   
  }
}
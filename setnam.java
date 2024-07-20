class setnam extends Thread
{
 public void run()
 {
  System.out.println("Thread is running");
   
  }
  public static void main(String[] args)
  {
    setnam obj1=new setnam();
    obj1.start();
    System.out.println("thread name is: "+ obj1.getName());
    obj1.setName("khushi");
    System.out.println("thread name after changing: "+ obj1.getName());
    
    
   }
}
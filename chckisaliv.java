class chckisaliv extends Thread
{
  public static void main(String[] args)
  {
   chckisaliv obj1=new chckisaliv();
   
   System.out.println(obj1.isAlive());
   chckisaliv obj2=new chckisaliv();
   obj2.start();
   System.out.println(obj2.isAlive());
  }
}
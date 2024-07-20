class iphone6
{
  void makecalls()
  {
     System.out.println("make calls");
   }
}
class iphone10 extends iphone6
{
  void facelock()
  {
     System.out.println("support face id lock");
   } 
}
class iphone12 extends iphone10
{
  void network()
  {
     System.out.println("5g network supporting");
   }
}
class multil
{
  public static void main(String[] args)
  {
    iphone12 obj=new iphone12();
    obj.makecalls();
    obj.facelock();
    obj.network();
  }
}
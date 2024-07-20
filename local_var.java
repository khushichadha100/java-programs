class local_var
{
  public void func()
 {
   int x=50;
   System.out.println("value of x is : "+x);
 }
  public void funerror()
 {
   //System.out.print("value of x is : "+x);//error
   System.out.print("another function unable to access x causing error ");
  }
  public static void main(String[] args)
  {
    local_var obj=new local_var();
    obj.func();
    obj.funerror();
  }
}
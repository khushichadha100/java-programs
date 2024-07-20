class t
{
  String name;
  void getname(String name)
  {
   this.name=name;
  }
  void pname()
  {
    System.out.println(name);
   }
  public static void main(String[] args)
  {
    t obj=new t();
    obj.getname("khushi");
    obj.pname();
     t obj2=new t();
    obj2.getname("vibhu");
    obj2.pname();
   }
}
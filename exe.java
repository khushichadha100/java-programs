public class exe {
static void proc()
{
try{
throw new NullPointerException();
}catch(NullPointerException e)
{
System.out.println("Inside the method");
throw e;
}
}
public static void main(String[] args) {
try
{
proc();
}catch(NullPointerException e)
{
System.out.println("Inside main");
}
}
}
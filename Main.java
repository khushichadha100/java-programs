class Test {

   // static variable
   static int max = 10;
  
   // non-static variable
   int min = 5;
}

public class Main {
   public static void main(String[] args) {
       Test obj = new Test();

       // access the non-static variable
       System.out.println( obj.min);

       // access the static variable
       System.out.println(Test.max);
   }
}
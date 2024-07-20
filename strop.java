public class strop
{  
  public static void main(String ar[])  
  {  
    String s="khushi";  
    System.out.println(s);
    System.out.println(s.length());
    System.out.println(s.indexOf('h'));
    System.out.println(s.toUpperCase());//SACHIN    
    System.out.println(s.toLowerCase());//sachin    
    System.out.println(s.charAt(0));//S    
    System.out.println(s.charAt(3));
    System.out.println(s.startsWith("h"));//true    
    System.out.println(s.endsWith("i"));//true 
    String s1="Java is a programming language. Java is a platform. Java is an Island.";      
    String replaceString=s1.replace("Java","Kava");      
    System.out.println(replaceString); 
    System.out.println(s.concat(s1));
     
  }  
} 
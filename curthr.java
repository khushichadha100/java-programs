public class curthr extends Thread 
{ 
 public void run() 
 { 
  System.out.println("thread running..."); 
  System.out.println("Thread in run : "+Thread.currentThread()); 
  
 } 
 public static void main(String[] args) 
 { 
   curthr t1=new curthr(); 
   t1.start(); 
   System.out.println("Thread in main : "+Thread.currentThread()); 
   
 } 
} 
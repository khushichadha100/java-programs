public class curandnam extends Thread 
{ 
 public void run() 
 { 
  System.out.println("thread running..."); 
  System.out.println("Thread in run : "+Thread.currentThread()); 
   System.out.println("Thread name in run: "+Thread.currentThread().getName()); 
 } 
 public static void main(String[] args) 
 { 
   curandnam t1=new curandnam(); 
   t1.start(); 
   System.out.println("Thread in main : "+Thread.currentThread()); 
   System.out.println("Thread name in main: "+Thread.currentThread().getName()); 
 } 
}  
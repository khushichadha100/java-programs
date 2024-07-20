class prconstavar extends Thread 
{ 
 public void run() 
 { 
 System.out.println( Thread.currentThread().getName() + "is running"); 
 } 
 public static void main(String[]args) 
 { 
  prconstavar p1= new  prconstavar(); 
  prconstavar p2= new  prconstavar(); 
  prconstavar p3= new  prconstavar(); 
 p1.start();p2.start();p3.start(); 
 System.out.println("P1  thread priority : " + p1.getPriority()); 
 System.out.println("P2  thread priority : " + p2.getPriority()); 
 System.out.println("P3  thread priority : " + p3.getPriority()); 
 System.out.println("P1  min thread priority : " + p1. MIN_PRIORITY); 
 System.out.println("P2  norm thread priority : " + p2. NORM_PRIORITY); 
 System.out.println("P3  max thread priority : " + p3. MAX_PRIORITY);  
 System.out.println("P1  thread priority : " + p1.getPriority()); 
 System.out.println("P2  thread priority : " + p2.getPriority()); 
 System.out.println("P3  thread priority : " + p3.getPriority()); 
 } 
} 
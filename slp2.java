public class slp2 extends Thread 
{ 
 slp2(String str){ 
 super(str); 
 } 
 
 public void run() 
 { 
 System.out.println(Thread.currentThread().getName()+" Started"); 
 try{ 
 slp2.sleep(5000); 
 }catch(InterruptedException ie){ 
 System.out.println(ie); 
 } 
 System.out.println(Thread.currentThread().getName()+" Finished"); 
 } 
 public static void main(String[] args) 
 { 
 slp2 t1=new slp2("first thread"); 
 slp2 t2=new slp2("second thread"); 
 t1.start(); 
 t2.start(); 
 } 
} 
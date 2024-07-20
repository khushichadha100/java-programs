public class daemonth extends Thread 
{ 
 public void run() 
 { 
 
 if(Thread.currentThread().isDaemon()) 
 { 
 System.out.println(getName() + " is Daemon thread"); 
 } 
 else 
 { 
 System.out.println(getName() + " is User thread"); 
 } 
 } 
 public static void main(String[] args) 
 { 
  daemonth obj1 = new  daemonth(); 
  daemonth obj2 = new  daemonth(); 
  daemonth obj3 = new  daemonth(); 
 obj1.setDaemon(true); 
 obj3.setDaemon(true);
 obj1.start(); 
 System.out.println("thread 1 name : " + obj1.getName());
 obj2.start(); 
 System.out.println("thread 2 name : " + obj2.getName());
 obj3.start(); 
 System.out.println("thread 3 name : " + obj3.getName());
 } 
}
 
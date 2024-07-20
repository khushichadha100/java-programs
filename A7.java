interface Printable{  
void print();  
int id=10;
}  
interface Showable{  
void show();  
int id=20;
}  
class A7 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
void p()
{
System.out.println("id from 1st interface= "+Printable.id);
System.out.println("id from 2nd interface= "+Showable.id);
}
public static void main(String args[]){  
A7 obj = new A7();  
obj.print();  
obj.show();  
obj.p();
 }  
}  
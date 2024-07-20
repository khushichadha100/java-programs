class Animal{  
String color="white";  
}  
class Dog extends Animal{  
String color="black";  
void printColor(){  
System.out.println("sub-class colour= "+ color);//prints color of Dog class  
System.out.println("base-class colour= "+super.color);//prints color of Animal class  
}  
}  
class st{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}}
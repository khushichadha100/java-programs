public class StaticDemo {
    // Static variable
    static int staticVar = 100;
    
    // Static block
    static {
        System.out.println("Inside Static Block");
       }
    
    // Static method
    static void staticMethod() {
        System.out.println("Inside Static Method");
     }
    
    public static void main(String[] args) {
        System.out.println("Static Variable in Main: " + staticVar);
        staticMethod();
        staticVar = 300;
        
        // Creating two objects
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        
        System.out.println("Static Variable in obj1: " + obj1.staticVar);
        System.out.println("Static Variable in obj2: " + obj2.staticVar);
        
        obj1.staticVar = 400;
        
        System.out.println("Static Variable after modifying obj1: " + staticVar);
        System.out.println("Static Variable in obj1 after modification: " + obj1.staticVar);
        System.out.println("Static Variable in obj2 after modification in obj1: " + obj2.staticVar);
    }
}


// Abstract class
abstract class Shape {
    protected String name;

    // Constructor in abstract class
    public Shape(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void displayArea();

    // Final method
    final void displayInfo() {
        System.out.println("Shape: " + name);
        displayArea(); // Calls the abstract method
    }
}

// Concrete subclass Circle
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(String name, double radius) {
        super(name); // Call to abstract class constructor
        this.radius = radius;
    }

    // Implementing abstract method
    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class  absconfin {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        circle.displayInfo(); // Calls final method displayInfo()
    }
}

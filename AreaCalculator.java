public class AreaCalculator {
    
    // Method overloading for square
    public static double calculateArea(double side) {
        return side * side; // Area of a square
    }
    
    // Method overloading for rectangle
    public static double calculateArea(double length, double breadth) {
        return length * breadth; // Area of a rectangle
    }
    
    // Method overloading for triangle
    public static double calculateArea(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height; // Area of a triangle
        } else {
            System.out.println("Invalid shape for this method!");
            return -1;
        }
    }
    
    public static void main(String[] args) {
        // Area of a square with side 5
        double squareArea = calculateArea(5.0);
        System.out.println("Area of square with side 5: " + squareArea);
        
        // Area of a rectangle with length 4 and breadth 6
        double rectangleArea = calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle with length 4 and breadth 6: " + rectangleArea);
        
        // Area of a triangle with base 5 and height 8
        double triangleArea = calculateArea(5.0, 8.0, "triangle");
        System.out.println("Area of triangle with base 5 and height 8: " + triangleArea);
    }
}

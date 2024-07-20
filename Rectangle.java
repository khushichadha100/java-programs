public class Rectangle {
    public int length , breadth ;
   
    
    // Input method to set length and breadth
    public void Input(int l,int b) {
        length = l;
        breadth = b;
    }
    
    // Output method to display length and breadth
    public void Output() {
        System.out.println("Length= " + length);
        System.out.println("Breadth= " + breadth);
    }
    
    // CalcArea method to calculate and return area
    public double CalcArea() {
        double area = length * breadth;
        return area;
    }
    
    public static void main(String[] args) {
        // Creating an object of Rectangle
        Rectangle rectangle = new Rectangle();
        
        // Assigning values to length and breadth
        int length= 5;
        int breadth = 10;
        
        // Calling Input method
        rectangle.Input(length,breadth);
        
        // Calling Output method
        rectangle.Output();
        
        // Calling CalcArea method
        double area = rectangle.CalcArea();
        System.out.println("Area: " + area);
    }
}


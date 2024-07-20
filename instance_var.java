class instance_var {
    // Instance variables
    String name;
    int age;

    public static void main(String[] args) {
        // Creating an instance of the Person class
        instance_var person = new instance_var();

        // Assigning values to instance variables
        person.name = "John";
        person.age = 30;

        // Printing the values of instance variables
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}

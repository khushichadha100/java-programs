// Address.java
class Address {
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

// Employee.java
class Employee {
    int id;
    String name;
    Address address; // Aggregation: Employee HAS-A Address

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address.city + ", " + address.state + ", " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("New Delhi", "Delhi", "India");
        Address address2 = new Address("Mumbai", "Maharashtra", "India");

        Employee emp1 = new Employee(101, "John Doe", address1);
        Employee emp2 = new Employee(102, "Jane Smith", address2);

        emp1.display();
        emp2.display();
    }
}

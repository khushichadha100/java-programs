import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private String address;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter age:");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter address:");
        address = scanner.nextLine();
    }

    public void showData() {
        System.out.println("EMPLOYEE DETAILS :- ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class  AD1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getData();
        emp.showData();
    }
}

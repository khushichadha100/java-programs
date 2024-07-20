// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Dog class extends Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Cat class extends Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

public class  hierarchicalex {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Specific to Dog
        
        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow(); // Specific to Cat
    }
}

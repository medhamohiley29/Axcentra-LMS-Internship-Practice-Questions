class Calculator {

    // Overloaded methods
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Over {
    public static void main(String[] args) {

        // Method Overloading
        Calculator calc = new Calculator();
        System.out.println("Add int: " + calc.add(2, 3));
        System.out.println("Add double: " + calc.add(2.5, 3.5));
        System.out.println("Add three ints: " + calc.add(1, 2, 3));

        // Method Overriding
        Animal a = new Animal();
        a.sound();

        Animal d = new Dog(); // Runtime polymorphism
        d.sound();
    }
}
class Vehicle {
    String brand;
    int speed;

    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "Toyota";
        c.speed = 120;

        c.doors = 4;

        c.start();        
        c.displayDetails(); 
        c.stop();         
    }
}
class Car extends Vehicle {
    int doors;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Doors: " + doors);
    }
}
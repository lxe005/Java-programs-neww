class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving");
    }
}

class ElectricCar extends Car {
    void move() {
        System.out.println("Electric Car is moving");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.move();
        Car c = new Car();
        c.move();
        ElectricCar ec = new ElectricCar();
        ec.move();
    }
}
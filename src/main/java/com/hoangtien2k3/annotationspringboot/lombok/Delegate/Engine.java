package com.hoangtien2k3.annotationspringboot.lombok.Delegate;

import lombok.experimental.Delegate;

public interface Engine {
    void start();
    void stop();
}

class CarEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Engine starts.");
    }

    @Override
    public void stop() {
        System.out.println("Engine stops.");
    }
}

class Car {
    @Delegate(types = Engine.class)
    private final Engine engine = new CarEngine();

    // Các phương thức khác của lớp Car
    public void drive() {
        System.out.println("Car is driving.");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Gọi phương thức start từ Engine
        car.stop();  // Gọi phương thức stop từ Engine
        car.drive(); // Gọi phương thức drive từ Car
    }
}

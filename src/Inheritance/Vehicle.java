package Inheritance;

public class Vehicle {
    double speed;
    String name = "vehicle";

    void go() {
        System.out.println("this " + name + " is moving");
    }

    void stop() {
        System.out.println("this " + name + " is stopped");
    }
}

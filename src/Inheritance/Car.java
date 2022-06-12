package Inheritance;

//we add the keyword extends and the name of the class we want to inherit everything from
//this means car is a subclass of vehicle, or child class
//vehicle is then the SuperClass or parent class
public class Car extends Vehicle {
    String name = "car";
    String color = "blue";
    int wheels = 4;
    int doors = 2;
    void colorname(){
        System.out.println("this car color is "+ color);
    }

}

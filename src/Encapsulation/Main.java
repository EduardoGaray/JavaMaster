package Encapsulation;

public class Main {
    public static void main(String[] args) {
        //encapsulation is a concept in object oriented programming in which attributes of a class will be hidden or private
        //they should only be accessible through methods like getters and setters
        //you should only make them public if you have a specific reason to do so
        Car car = new Car("Chevrolet","Camaro",2021);
        //if we try to access the attributes of this new object, we won't be able to so,
        //because the attributes are set to private, to access them, we need to use the getter method
        System.out.println(car.getMaker());
        if(car.getYear() == 2021){
            System.out.println("it is a good year");
            car.setYear(2022);
            System.out.println("but now it is "+car.getYear());
        }
    }

}

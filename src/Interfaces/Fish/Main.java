package Interfaces.Fish;

public class Main {
    public static void main(String[] args) {
        //interfaces are templates that can be applied to a class
        //similar to inheritance but specifies what a class can/must do
        //class can apply more than one interface, while inheritance is limited to 1 super/parent class
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();



    }
}

package Interfaces.Printer;

//Interfaces shouldnt be implemented, but rather, be used like contracts
//this is still a functional interface because it only has a single abstract method
//because of this, no matter how many default or static methods we have in our interface, this will still be a functional interface
public interface Printer {
    //abstract method
    //it is a called a functional interface because it references a function
    void print(String message);

    //default implemented method
//    default void printTwice(String message){
//        System.out.println(message);
//        System.out.println(message);
//    }
}

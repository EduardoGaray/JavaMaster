package Interfaces.Printer;

//For this class to make use of the interface class Printer, we must implement it and its methods
public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        //we are printing the message from the interface printer method
        System.out.println(message);
    }
}

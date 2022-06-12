package Interfaces.Printer;

public class LambdasDemo {
    public LambdasDemo() {}
    public LambdasDemo(String message) {}

    public static String affix = "*";
    public String affix2 = "!";

    public static void main(String[] args) {
        show();
        showanon();
        showlambda();
        LambdasDemo lambdasDemo = new LambdasDemo();
        lambdasDemo.showInstancedLambda();
        methodReference();
    }

    public static void print(String message) {}

    public void print2(String message) {}

    public static void methodReference() {
        //Class/Object::method
        // without parenthesis, we don't want to call the method, just add a reference to it,
        //we can reference static and instantiated objects and variables in this class as well as constructors
        greet(System.out::println);
        //we are going to call the print method in this class, that matches with the print method in the interface
        greet(LambdasDemo::print);
        //we can also call an instanced method
        LambdasDemo demo = new LambdasDemo();
        greet(demo::print2);
        //now let's also call it from a constructor with a parameter
        greet(LambdasDemo::new);


    }

    //this version of the printer method uses a lambda expression
    //lambda expressions are like anonymous methods that can be passed around and used on its own, without a class
    public static void showlambda() {
        //static variables from this class can be added to the lambda expression
        //we can include local variables of the method in a lambda expression too
        String prefix = "_";
        //we add () ony if we have no parameters, or more than 1 parameter
        //there is no need to add the type of variable as the java compiler knows it
        //example greet((x,z,y) ->
        greet(message -> System.out.println(prefix + message + affix));
        //we can also store a lambda expression in a variable
        Printer printer = message -> System.out.println(prefix + message);

    }

    public void showInstancedLambda() {
        String prefix = "_";
        //this in this case represents the current instance of the LambdasDemo Class
        //in lambda expressions this represents the enclosing object
        // whereas in anonymous inner classes, this represents the current instance of the anonymous inner class
        greet(message -> System.out.println(prefix + message + this.affix2));
    }

    //this alternate show method makes use of anonymous inner classes
    //because sometimes we just need a single interface for a specific purpose without creating a class for it
    public static void showanon() {
        //Instead of creating a new instance of the ConsolePrinter class, we just write Printer
        greet(new Printer() {
            //its anonymous because it doesn't have a name just an implementation,
            //and we call it inner because we use it inside a method
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void show() {
        greet(new ConsolePrinter());

    }

    //we are using a static method, so we can easily call this method from the other static method above
    public static void greet(Printer printer) {
        printer.print("Goodbye World");

    }
}

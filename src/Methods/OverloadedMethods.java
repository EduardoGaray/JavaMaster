package Methods;

public class OverloadedMethods {
    public static void main(String[] args) {
        //overloaded methods are those who share the same name but have different parameters
        //method name + method parameters = method signature
        int one = add(1, 2);
        int two = add(1, 2, 3);
        System.out.println(one);
        System.out.println(two);
        double third = add(1.0, 2.0);
        double fourth = add(1.0, 2.0, 3.0);
        System.out.println(third);
        System.out.println(fourth);


    }

    static int add(int a, int b) {
        System.out.println("this is overloaded method 1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("this is overloaded method 2");
        return a + b + c;
    }

    static double add(double a, double b) {
        System.out.println("this is overloaded method 3");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("this is overloaded method 4");
        return a + b + c;
    }
}

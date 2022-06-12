package AccessModifiers.Package2;
//import the specific class we need from the package or use * to access the entire package

import AccessModifiers.Package1.*;

public class Asub extends A {
    public static void main(String[] args) {
        Asub asub = new Asub();
        //even thought protectedMessage is protected, we can access it from A because Asub is a subclass of A
        System.out.println(asub.protectedMessage);

    }
}

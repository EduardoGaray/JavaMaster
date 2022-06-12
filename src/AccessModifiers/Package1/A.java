package AccessModifiers.Package1;

import AccessModifiers.Package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);

    }
}

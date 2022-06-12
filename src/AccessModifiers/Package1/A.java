package AccessModifiers.Package1;

import AccessModifiers.Package2.*;

public class A {
    //protected: visible to all classes in the same package or classes in other packages that are a subclass
    protected String protectedMessage = "This is protected";
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        System.out.println(c.publicMessage);
        //cannot access to privateMessage because it is private
        //System.out.println(c.privateMessage);


    }
}

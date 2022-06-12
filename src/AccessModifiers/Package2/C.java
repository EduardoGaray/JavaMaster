package AccessModifiers.Package2;

import AccessModifiers.Package1.*;

public class C {
    //default means its only accessible from the same package
    String defaultMessage = "This is the default";
    //public means is accessible from anywhere
    public String publicMessage = "This is public";
    //protected is accessible only to any subclass of the class it was declared in as long as it is in the same package
    protected String protectedMessage = "This is protected";

}

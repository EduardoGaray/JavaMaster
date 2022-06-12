package AccessModifiers.Package2;

import AccessModifiers.Package1.*;

public class C {
    //default: visible to all classes in the same package
    String defaultMessage = "This is the default";
    //public: visible in all classes in all packages
    public String publicMessage = "This is public";
    //protected: visible to all classes in the same package or classes in other packages that are a subclass
    protected String protectedMessage = "This is protected";
    //private: visible only in the same class
    private String privateMessage = "This is private";

}

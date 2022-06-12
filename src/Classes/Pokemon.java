package Classes;

public class Pokemon {
    //empty constructor
    public Pokemon(){}
    //constructor with parameters
    //to make sure we use the most local variables instead of global variables with the same name in the same class,
    //we use the keyword this, to difference them
    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }
    //variables
    String name;
    int level;
    //method
    void attack() {
        System.out.println(name + " attack!");
    }
}

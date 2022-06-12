package Classes;

public class Main {
    public static void main(String[] args) {
        //we call the class we want to make a new object from and give a name to the new object, in this case p1
        // then java goes into memory and assigns space to this new Pokemon class object we are creating
        Pokemon p1 = new Pokemon();
        //then we use the dot ( . ) operator to give a value to any part of the new object
        p1.name = "bulbasaur";
        p1.level = 6;
        //each object has it's own set of variables that are unique to each of them, so p2 gets its own name and level
        Pokemon p2 = new Pokemon();
        p2.name = "charizard";
        p2.level = 36;
        //now let's call the attack method
        p2.attack();
        //one of the basics of objects is this, changing the values of an object of the pokemon class doesn't change
        //the values of another object of the same class

        //when we want to create an object with certain values already set in, we use a constructor with parameters
        Pokemon p3 = new Pokemon("dragonite",60);

    }
}

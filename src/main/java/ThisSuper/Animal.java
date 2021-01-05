package ThisSuper;

public class Animal {
    
    static int id = 1;
    String name = "Animal";
    String type = "Buldog";

    public Animal() {
        this(4);
        System.out.println("No argument Animal constructor");
    }
    
    public Animal(int i) {
        //this();
        System.out.println("Animal constructor with argument");
    }
    
    public void animalSay() {
        System.out.println("I am Animal");
    }
    
    
    

}

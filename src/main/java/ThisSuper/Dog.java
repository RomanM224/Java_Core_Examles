package ThisSuper;

public class Dog extends Animal{
    
    static int id = 2;
    String name = "Dog";
    String type = "Buldog";

    public Dog() {
        System.out.println("No argument Dog constructor");
    }
    
    public Dog(int i) {
        //super();  //Invoke no arguments constructor
        super(5);   //Invoke parameterized constructor
        System.out.println("Dog constructor with argument");
    }
    
    public void thisShow() {
        type = "ad";
        this.id = 3;
        this.name = "New Dog";
        System.out.println(this.id);
        System.out.println(this.name);
    }
    
    public void superShow() {
        super.id = 4;
        super.name = "New Animal";
        System.out.println(super.id);
        System.out.println(super.name);
    }
    
    public void say() {    //Invoke parent method
      //  this.superShow();
        super.animalSay();
    }
    
    public Dog getInstance() {
        return this;
    }
    
// Can not use this and super in static methods
//    public static void thisShow1() {   
//        System.out.println(this.id);
//        System.out.println(this.name);
//    }

}

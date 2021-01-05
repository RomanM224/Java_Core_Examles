package ThisSuper;

public class Main {

    public static void main(String[] args) {
        // Animal animal = new Animal(); //Invoke 2 constructors in Animal Class
        
        //Invoke one parameterized constructor in Dog Class and
        // parameterized constructor in Animal Class
        // Dog dog = new Dog(5);

        Dog dog = new Dog();
        dog.thisShow();     //Show self variables
        dog.superShow();    //Show parent variables
        dog.say();          //Invoke parent method
        
        dog.name = "John";
        System.out.println(dog.name);
        
        Dog dog2 = dog.getInstance();
        System.out.println(dog2.name);
        Dog dog3 = new Dog();
        System.out.println(dog3.name);
    }

}

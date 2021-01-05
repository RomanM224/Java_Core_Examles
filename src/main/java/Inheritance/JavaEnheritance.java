package Inheritance;

public class JavaEnheritance {
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal dog2 = new Dog();
        
        animal.say();
        dog.say();
        dog2.say();
        
        //static method
        animal.sayStatic();
        dog.sayStatic();
        dog2.sayStatic();
    }

}

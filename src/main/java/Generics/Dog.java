package Generics;

public class Dog extends Animal implements PetDog{

    @Override
    public void say() {
        System.out.println("I am dog");
    }
    
    public void go() {
        System.out.println("Dog go");
    }
}

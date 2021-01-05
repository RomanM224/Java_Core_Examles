package Generics;

public class Cat extends Animal implements PetCat{

    @Override
    public void say() {
        System.out.println("I am cat");
    }
    
    public void go() {
        System.out.println("Cat go");
    }
}

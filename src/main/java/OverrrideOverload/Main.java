package OverrrideOverload;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        Man man = new Man();
        Human man2 = new Man();
        
        human.say();
        man.say();
        man2.say();   //Dynamic Method Dispatch
    }

}

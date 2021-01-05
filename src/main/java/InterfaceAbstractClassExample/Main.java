package InterfaceAbstractClassExample;

public class Main {

    public static void main(String[] args) {
        Human human = new Man();
        human.myMethod();
        
        Man man = new Man();
        man.sayHello();
        man.goodbay();
        
        Cyborg.says();
    }

}

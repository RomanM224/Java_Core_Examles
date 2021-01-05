package InterfaceAbstractClassExample;

public class Man extends Human{

    @Override
    public void myMethod() {
        System.out.println("I Overide abstact method");
        
    }
    
    public void sayHello() {
        System.out.println("Only sees my class Man");
    }

    @Override
    public void go() {
        System.out.println("Go");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
        
    }

}

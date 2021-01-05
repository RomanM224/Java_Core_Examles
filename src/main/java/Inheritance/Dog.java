package Inheritance;

public class Dog extends Animal{
    
    @Override
    public void say() {
        System.out.println("I am Dog");
    }
    
    public void name() {
        
    }
    
    public static void sayStatic() {
        System.out.println("I am Dog Static");
    }

}

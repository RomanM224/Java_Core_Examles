package InterfaceAbstractClassExample;

public abstract class Human implements Cyborg{
    
    public Human() {
        System.out.println("I am Human");
        dosmtn();
    }
    
    
    private void dosmtn() {
        System.out.println("Do smt in private");
    }
    
   public abstract void myMethod();
   
   

}

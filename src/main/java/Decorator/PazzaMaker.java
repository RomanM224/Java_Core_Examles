package Decorator;

public class PazzaMaker {

    public static void main(String[] args) {
        System.out.println("hello");
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());
    }

}

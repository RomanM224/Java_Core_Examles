package MathRandom;

public class MathExample {

    public static void main(String[] args) {
        int num2 = Math.abs(-5);
        System.out.println(num2);
        
        System.out.println("Math.addExact(30, -2) - " + Math.addExact(30, -2));
        
        System.out.println("Math.floor(2.2) - " + Math.floor(2.2));
        System.out.println("Math.floor(2.8) - " + Math.floor(2.8));
        System.out.println("Math.floor(0.8) - " + Math.floor(0.8));
        
        System.out.println("Math.round(2.2) - " + Math.round(2.2));
        System.out.println("Math.round(2.8) - " + Math.round(2.8));
        System.out.println("Math.round(0.8) - " + Math.round(0.8));
        
        
        System.out.println("Math.floorDiv(20, 3) - " + Math.floorDiv(20, 3));  //Возврашает результат деление округлённое в меньшию сторону
        int i = 5;
        System.out.println(++i);
        System.out.println(i);
        
        System.out.println("Math.multiplyExact(3, 5) - " + Math.multiplyExact(3, 5));
        System.out.println("Math.negateExact(2) - " + Math.negateExact(2));
        
        System.out.println("Math.pow(2, 10) - " + Math.pow(2, 10));
        System.out.println("Math.sqrt(25) - " + Math.sqrt(25));
        System.out.println("Math.sqrt(24) - " + Math.sqrt(24));
        
        System.out.println("Math.random() - " + Math.random());
        
    }

}

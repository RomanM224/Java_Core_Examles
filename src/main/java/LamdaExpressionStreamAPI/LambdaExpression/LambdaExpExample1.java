package LamdaExpressionStreamAPI.LambdaExpression;
interface FuncInterface 
{ 
    // An abstract function 
    void abstractFun(int x); 
  
    // A non-abstract (or default) function 
    default void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
} 

public class LambdaExpExample1 {

    public static void main(String[] args) {
     // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = (int x)->System.out.println(3*x); 

        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5); 
    }

}

package LamdaExpressionStreamAPI.LambdaExpression;

public class LambdaExpExample3 {
    
    public interface MyFactory {
        public String create(char[] chars);
    }
    
    public static void main(String[] args) {
        String myString = "Test";  //You can not change this variable when using it in Lambda Expression,
                                   //if you will doing it compiler throw error.

        MyFactory myFactory = (chars) -> myString + ":" + new String(chars);
        char[] charArray = {'a', 'b'};
        System.out.println(myFactory.create(charArray));
        
        LambdaExpExample3 labmaExmpl = new LambdaExpExample3();
        labmaExmpl.exmpl();
        labmaExmpl.str = "What";
        labmaExmpl.exmpl();

    }
    
    String str = "Test";
    public void exmpl() {
        MyFactory myFactory = (chars) -> str + ":" + new String(chars);
        
        char[] charArray = {'a', 'b'};
      
        System.out.println(myFactory.create(charArray));
    }

}

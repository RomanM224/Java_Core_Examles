package InnerClass;

public class OutherStaticNestedClass {
    
    public int num = 5;
    private static int numStatic = 10;
    
    static class Inner{
        
        void show(int a) {
            numStatic = a;
    //        System.out.println(num);  //Not works because variable non-static
            System.out.println(a);
        }
    }

}

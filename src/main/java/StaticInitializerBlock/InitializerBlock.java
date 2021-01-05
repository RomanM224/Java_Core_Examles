package StaticInitializerBlock;

public class InitializerBlock {
    
    public static void main(String arr[]) {
        InitializerBlock obj1, obj2;
        obj1 = new InitializerBlock();
        obj1.i = 6;
        obj2 = new InitializerBlock(0);
    }

    int i;
    {
        i = 5;
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends

    public InitializerBlock() {
        System.out.println("Default Constructor invoked");
    }

    public InitializerBlock(int x) {
        System.out.println("Parametrized constructor invoked");
    }

}

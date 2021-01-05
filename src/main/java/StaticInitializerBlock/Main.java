package StaticInitializerBlock;

public class Main {

    public static void main(String[] args) {
        // Although we don't have an object of Test, static block is  
        // called because i is being accessed in following statement. 
      //  System.out.println(StaticBlock.i);
        
        // Although we have two objects, static block is executed only once.
        StaticBlock staticBlock = new StaticBlock();
        StaticBlock staticBlock2 = new StaticBlock();
    }

}

package StaticInitializerBlock;

public class StaticBlock {
    
    static int i; 
    int j; 
      
    StaticBlock(){ 
        System.out.println("Constructor called"); 
    } 
    // start of static block  
    static { 
        i = 10; 
        System.out.println("static block called "); 
    } 
    // end of static block  

}

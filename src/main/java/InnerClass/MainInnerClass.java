package InnerClass;

public class MainInnerClass {

    public static void main(String[] args) {
  //      OutherStaticNestedClass.Inner staticNested = new OutherStaticNestedClass.Inner();   //static nested class
    //    inner.show(103);
        
//        Outher1 outher1 = new Outher1();
//        Outher1.Inner1 inner1 = outher1.new Inner1();
        OutherInnerClass.Inner inner = new OutherInnerClass().new Inner();  //inner class
        
        OutherLocalClass outerLocal = new OutherLocalClass();
        OuterAnonymousClass clas = new OuterAnonymousClass() {
            
        };
    }
}

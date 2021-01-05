package InnerClass;

public class OutherLocalClass {

    public OutherLocalClass() {
        class LocalInnerClass {
            private int a;
            public void say() {
                
                System.out.println(sum(5));
            }
        }
        LocalInnerClass local = new LocalInnerClass();
        local.say();
    }
    
    private int sum(int i) {
        i = i + i;
        return i;
    }

}

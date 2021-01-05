package Singleton;

public class SingletonPublicStaticFactory {
    
    private static final SingletonPublicStaticFactory INSTANCE = new SingletonPublicStaticFactory();
    
    private SingletonPublicStaticFactory() {}
    
    public static SingletonPublicStaticFactory getInstance(){
        return INSTANCE;
    }

}

package Singleton;

import java.io.Serializable;

public class SingeltonPublicStaticFinal implements Serializable{
    
    public static final SingeltonPublicStaticFinal INSTANCE = new SingeltonPublicStaticFinal();
    int value;
    
    private SingeltonPublicStaticFinal() {}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    //This method allows us to serialize/deserialize singleton, 
    //without this method during deserialization we will get new Singleton, so we will have 2 Singleton
    protected Object readResolve() {
        return INSTANCE;
    }
    
    

}

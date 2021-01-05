package Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDemo implements Serializable {
    
    public static void main(String[] args) {
        SingeltonPublicStaticFinal singleton = SingeltonPublicStaticFinal.INSTANCE;
        singleton.setValue(1);
        // Serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("SingletonExample.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(singleton);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        singleton.setValue(2);
        // Deserialize
        SingeltonPublicStaticFinal singleton2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("SingletonExample.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            singleton2 = (SingeltonPublicStaticFinal) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("singletons.SingletonEnum class not found");
            c.printStackTrace();
        }
        if (singleton == singleton2) {
            System.out.println("Two objects are same");
        } else {
            System.out.println("Two objects are not same");
        }
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}

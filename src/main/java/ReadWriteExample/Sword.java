package ReadWriteExample;

import java.io.Serializable;

public class Sword implements Serializable{
    
    public String name;

    public Sword(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sword [name=" + name + "]";
    }
    

}

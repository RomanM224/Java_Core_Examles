package ReadWriteExample;

import java.io.Serializable;

public class User implements Serializable{
    
    public String name;
    transient public int level;
    public Sword sword;
    
    public User(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", level=" + level + ", sword=" + sword + "]";
    }
    
    
    
}

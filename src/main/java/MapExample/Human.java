package MapExample;
import java.util.Objects;

public class Human {
    Integer id;
    String name;
    
    public Human(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof Human)) {
            return false;
        }
        Human human = (Human) o;
        if(!human.name.equals(name)) {
            return false;
        }
        if(human.id != id) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Human [id=" + id + ", name=" + name + "]";
    }

    
}

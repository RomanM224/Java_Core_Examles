package MyTest;

public class User {
    
    final Car car;
    final String name;
    
    public User(Car car, String name) {
        this.car = car;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [car=" + car + ", name=" + name + "]";
    }

    
}

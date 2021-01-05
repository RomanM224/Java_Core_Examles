package MyTest;

public class Car {
    
    static int id;
    Boolean check;
    String name;

    public Car() {
        
    }
    
    public static void show() {
        System.out.println(id);
    }
    public Car(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Car [id=" + id + ", name=" + name + "]";
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Car.id = id;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    

}

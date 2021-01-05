package Collections.CollectionSort;

public class Mountain {
    
    private String name;
    private Integer height;
    
    
    public Mountain(String name, Integer height) {
        this.name = name;
        this.height = height;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public String toString() {
        return "Mountain [name=" + name + ", height=" + height + "]";
    }
    

}

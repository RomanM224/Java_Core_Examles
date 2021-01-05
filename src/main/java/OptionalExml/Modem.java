package OptionalExml;

public class Modem {
    
    private Double price;
    
    public Modem(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Modem [price=" + price + "]";
    }
    

}

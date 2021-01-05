package LamdaExpressionStreamAPI.LambdaExpression;

public class MethodReferanceBicycle {
    private String brand;
    private Integer frameSize;
    
    
    public MethodReferanceBicycle(String brand, Integer frameSize) {
        this.brand = brand;
        this.frameSize = frameSize;
    }
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Integer getFrameSize() {
        return frameSize;
    }
    public void setFrameSize(Integer frameSize) {
        this.frameSize = frameSize;
    }

    @Override
    public String toString() {
        return "MethodReferanceBicycle [brand=" + brand + ", frameSize=" + frameSize + "]";
    }
    
    
    
    
}

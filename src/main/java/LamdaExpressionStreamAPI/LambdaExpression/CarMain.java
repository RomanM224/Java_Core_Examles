package LamdaExpressionStreamAPI.LambdaExpression;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.carDrive();
        car.setName("asd");
        car.carDrive();
        car.setName("BMW");
        car.carDrive();
        car.carDrive2();
        car.name2 = "Mercedes";
        car.carDrive2();

    }

}

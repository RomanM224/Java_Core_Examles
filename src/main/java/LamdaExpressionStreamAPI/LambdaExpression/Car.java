package LamdaExpressionStreamAPI.LambdaExpression;

public class Car {
    
    private String name = "Mazda";
    static String name2 = "Audi";
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void carDrive() {
        CarInterface carInterface = name -> System.out.println(name + ": car drive");
        carInterface.drive(name);
    }
    
    public void carDrive2() {
//        CarInterface carInterface = new CarInterface() {    
//            @Override
//            public void drive(String name) {
//                System.out.println("Drive" + name);
//            }
//        }; 
        CarInterface carInterface = name -> System.out.println(name + ": car drive");
        carInterface.drive(name2);
    }
}

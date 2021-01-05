package JVMExample;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();

        // Getting hold of Class object created
        // by JVM.
        Class studentClass = student.getClass();

        // Printing type of object using c1.
        System.out.println("Get class name: " + studentClass.getName());

        // getting all methods in an array
        Method m[] = studentClass.getDeclaredMethods();
        System.out.println("Get all methods:");
        for (Method method : m)
            System.out.println(method.getName());

        // getting all fields in an array
        System.out.println("Get all fields:");
        Field f[] = studentClass.getDeclaredFields();
        for (Field field : f) {
            System.out.println(field.getName());
        }
        
        // String class is loaded by bootstrap loader, and 
        // bootstrap loader is not Java object, hence null 
        System.out.println(String.class.getClassLoader()); 
  
        // Main class is loaded by Application loader 
        System.out.println(Main.class.getClassLoader());

    }

}

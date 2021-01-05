package Enum;

//Java program to demonstrate working of values(), 
//ordinal() and valueOf() 
enum Color {
    REDAS, GREEN, BLUE;
    
    int i = 5;
    
    private Color() 
    { 
        System.out.println("Constructor called for : " + 
        this.toString()); 
    } 
  
    public void colorInfo() 
    { 
        System.out.println("Universal Color"); 
    } 
}

public class EnumExapmle {
    public static void main(String[] args) {
        Color c1 = Color.GREEN; 
        System.out.println(c1); 
        System.out.println(Color.BLUE); 
        // Calling values()
        c1.colorInfo();
        System.out.println(c1.i);
        c1.i = 6;
        Color arr[] = Color.values();

        // enum with loop
        for (Color col : arr) {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index " + col.ordinal());
        }

        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(Color.valueOf("REDAS"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}

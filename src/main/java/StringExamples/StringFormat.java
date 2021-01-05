package StringExamples;

import java.time.LocalDate;

public class StringFormat {
    
    public static void main(String[] args) {
        Integer number = 512;
        System.out.println("Number is 512");
        System.out.printf("{ %%d }     -> |%d|\n", number);
        System.out.printf("{ %% d }    -> |% d|\n", number);
        System.out.printf("{ %%2d }    -> |%2d|\n", number);
        System.out.printf("{ %%07d }   -> |%07d|\n", number);
        System.out.printf("{ %%14d }   -> |%14d|\n", number);
        System.out.printf("{ %%-14d }  -> |%-14d|\n\n", number);
        
        double floatNumber = 1595.4953869204;
        System.out.println("Number is 1595.4953869204");
        System.out.printf("{ %%f }     -> |%f|\n", floatNumber);
        System.out.printf("{ %% f }     -> |% f|\n", floatNumber);
        System.out.printf("{ %%14f }   -> |%14f|\n", floatNumber);
        System.out.printf("{ %%-14f }  -> |%-14f|\n", floatNumber);
        System.out.printf("{ %%14.3f } -> |%14.3f|\n", floatNumber);
        System.out.printf("{ %%.5f }   -> |%.5f|\n", floatNumber);
        System.out.printf("{ %%14.3e } -> |%14.3e|\n\n", floatNumber);
        
        String str = "Hello World";
        System.out.println("String is \"Hello World\"");
        System.out.printf("{ %%s }     -> |%s|\n", str);
        System.out.printf("{ %%s }     -> |%s|\n", str);
        System.out.printf("{ %%14s }   -> |%14s|\n", str);
        System.out.printf("{ %%-14s }  -> |%-14s|\n", str);
        System.out.printf("{ %%14.8s } -> |%14.8s|\n", str);
        System.out.printf("{ %%.8s }   -> |%.8s|\n\n", str);
        
        boolean check = true;
        System.out.println("Boolean is \"True\"");
        System.out.printf("{ %%b }     -> |%b|\n", check);
        System.out.printf("{ %%14b }   -> |%14b|\n", check);
        System.out.printf("{ %%-14b }  -> |%-14b|\n", check);

        
    }
    

}

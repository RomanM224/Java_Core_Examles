package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexExExample2 {

    public static void main(String[] args) {
   //     findByCharacterClasses();
        
    //    findByCharacterClasses2();
        
    //    findByCharacterClasses3();
        
    //    findByCharacterClasses4();
        
   //     findByCharacterClasses5();
        
//        findAllNumbers();
//        
//        findAllNotNumbers();
//        
//        findAllNumbersAndLetters();
//        
//        findAllSpaces();

    }
    //special characters - metacharacters, but thye are not special in characters classes [...]
    //[]\^$.\?*+()
    //special characters in characters classes : ]\^-

    public static void findByCharacterClasses() {
        Pattern pattern = Pattern.compile("[a-b]"); // find all literals between a - b
        Matcher matcher = pattern.matcher("abc");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }
    
    public static void findByCharacterClasses2() {
        Pattern pattern = Pattern.compile("[0-5a-bA-Z]"); // find all numbers between 0 - 5 and literals between a - b A - Z
        Matcher matcher = pattern.matcher("abc149AWY");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }
    
    public static void findByCharacterClasses3() {
        Pattern pattern = Pattern.compile("gr[ae]y"); //find by pattern "gray" or "grey"
        Matcher matcher = pattern.matcher("grey");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }
    
    //special characters in characters classes : ]\^-
    public static void findByCharacterClasses4() {
        Pattern pattern = Pattern.compile("y[^u]"); //find any character except 'u' that go after 'y'
        Matcher matcher = pattern.matcher("you");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }
    
    public static void findByCharacterClasses5() {
        Pattern pattern = Pattern.compile("[-x]"); 
        Matcher matcher = pattern.matcher("ax - q");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
    }
    
    public static void findAllNumbers() {
        Pattern pattern = Pattern.compile("\\d");  //find all numbers
        Matcher matcher = pattern.matcher("I am 28 years old");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }
    
    public static void findAllNotNumbers() {
        Pattern pattern = Pattern.compile("\\D");  //find everting that are not numbers
        Matcher matcher = pattern.matcher("I am 28 years old");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }
    
    public static void findAllNumbersAndLetters() {
        Pattern pattern = Pattern.compile("\\w");  //find letters and numbers but not find spaces
        Matcher matcher = pattern.matcher("I am 28 years old");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }
    
    public static void findAllSpaces() {
        Pattern pattern = Pattern.compile("\\s");  
        Matcher matcher = pattern.matcher("I am 28 years old");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }
    
    

}

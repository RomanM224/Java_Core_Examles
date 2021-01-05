package StringExamples;

public class StringExample {

    public static void main(String[] args) {
//        stringCharAt();
//        
//        stringCodePointAt();
//        
        stringCompareTo();
//        
//        stringCompareToIgnoreCase();
//        
//        stringConcat();
//        
  //      stringContains();
//        
//        stringValueOf();
//        
//        stringEndWith();
//        
 //       stringIndexOf();
//        
//        stringSplit();
//        
//        stringStartWith();
//        
//        stringSubString();
//        
 //       stringTrim();
        
//        stringReplace();
//        
//        stringReplaceAll();
    }
    
    public static void stringCharAt() {
        String str = "string";
        char  char1 = str.charAt(0);
        System.out.printf("Get character from string \"%s\" by index \"0\" result is - \"%s\"\n\n",str, char1);
    }
    
    public static void stringCodePointAt() {
        String str = "string";
        int character = str.codePointAt(0);
        System.out.printf("Get character in unicode from string \"%s\" by index \"0\" result is - \"%d\"\n\n",str, character);
    }
    
    public static void stringCompareTo() {
        String str = "string";
        String str2 = "strings";
        int compare = str.compareTo(str2);
        System.out.printf("Compare \"%s\" and \"%s\" result is - \"%d\"\n\n", str, str2, compare);
    }
    
    public static void stringCompareToIgnoreCase() {
        String str = "string";

        String str2 = "STRING";
        int compare2 = str.compareToIgnoreCase(str2);
        System.out.printf("Compare with ignore case \"%s\" and \"%s\"  result is - \"%d\"\n\n", str, str2, compare2);
    }
    
    public static void stringConcat() {
        String str = "string";
        String str2 = "STRING";
        String str3 = str.concat(str2);
        System.out.printf("Conatenates \"%s\" and \"%s\"  result is - \"%s\"\n\n", str, str2, str3);
    }
    
    public static void stringContains() {
        String str = "string";
        String str2 = "rin";
        boolean check = str.contains(str2);
        System.out.printf("Check if string \"%s\" cantain string \"%s\"  result is - \"%b\"\n\n", str, str2, check);
    }
    
    public static void stringValueOf() {
        char[] charArray = {'a', 'b', 'c', 'f', 'g', ' ', 'h', 'y'};
        Character charValue = 's';
        Integer intValue = 6;
        Double floatValue = 4.3;
        Boolean booleanValue = true;
     //   String charArrayString = new String(charArray);
        String charArrayString = String.valueOf(charArray);
        String charArrayString2 = String.valueOf(charArray, 1, 5);
        String charValueString = String.valueOf(charValue);
        String intValueString = String.valueOf(intValue);
        String floatValueString = String.valueOf(floatValue);
        String booleanValueString = String.valueOf(booleanValue);
        System.out.printf("Value of char array  result is - \"%s\"\n", charArrayString);
        System.out.printf("Value of char array  result is - \"%s\"\n", charArrayString2);
        System.out.printf("Value of char   result is - \"%s\"\n", charValueString);
        System.out.printf("Value of int  result is - \"%s\"\n", intValueString);
        System.out.printf("Value of float  result is - \"%s\"\n", floatValueString);
        System.out.printf("Value of boolean  result is - \"%s\"\n\n", booleanValueString);
    }
    
    public static void stringEndWith() {
        String str = "string";
        boolean check2 = str.endsWith("ing");
        System.out.printf("Check if \"%s\" end on suffix \"ing\" result is - %b\n\n", str, check2);
    }
    
    public static void stringIndexOf() {
        String str = "string";
        int indexOf = str.indexOf(115);
        System.out.println("index of 115 is - " + indexOf);
        int indexOf1 = str.indexOf("rin");
        System.out.println("Index of \"rin\" is - " + indexOf1 + "\n");
    }
    
    
    public static void stringSplit() {
        String str = "Go to the shop";
        String[] stringArray = str.split(" ");
        System.out.println("Split \"Go to the shop\" { to string array } ");
        for(String s: stringArray) {
        System.out.println(s);
        }
    }
    
    public static void stringStartWith() {
        String str = "string";
        boolean check = str.startsWith("str");
        System.out.println("\nCheck if \"string\" start with str result is - " + check);
        boolean check2 = str.startsWith("ri",2);
        System.out.printf("Check if \"string\" with specified index 2 starts with the specified prefix \"ri\" result is - %b\n\n", check2);
    }
    
    public static void stringSubString() {
        String str = "string";
        String subString = str.substring(1);
        System.out.println("String - " + str);
        System.out.println("Substrin 1 - " + subString);
        String subString2 = str.substring(2, 4);
        System.out.println("Substrin 2 - " + subString2 + "\n");
    }
    
    public static void stringTrim() {
        String beforeTrim = "    Go to   the     shop      !    ";
        System.out.println(beforeTrim);
        String afterTrim = beforeTrim.trim();
        System.out.println(afterTrim);
        String after = beforeTrim.trim().replaceAll(" +", " ");
        System.out.println(after);
    }
    
    public static void stringReplace() {
        String str = "Go   to  the  shop ! ";
        System.out.println(str);
        String str2 = str.replace(" ", "%");
        System.out.printf("Replace all characters \"st\" to \"r\" in \"%s\" result is - \"%s\"\n\n", str, str2);
    }
    
    public static void stringReplaceAll() {
        String string = "Go   to  the  shop ! ";
       // System.out.println(string.trim().replaceAll(" +", " ") + "\n");
        System.out.println(string);
        String replaceString = string.replaceAll(" ", "%");
        System.out.println("Replcase all \" \" on \"%\" in string" + string);
        System.out.println(replaceString + "\n");
    }
    
    
    
    
}

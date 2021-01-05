package AutoboxiUnnboxing;

public class AutoboxinUnboxingExapmle {

    public static void main(String[] args) {
        int num = 3;
        Integer num2 = num+1;  //Integer y = Integer.valueOf(x+1);
        System.out.println(num2);
        
        int z = num2;  //int z = y.intValue();
        System.out.println(z);
        
        Boolean num3 = Boolean.FALSE;
        boolean num4 = num3;  // boolean a = b.booleanValue();
        System.out.println(num4 + "\n");
        
        int int1 = 500;
        int int2 = 500;
        Integer int3 = 500;
        Integer int4 = 500;
        System.out.printf("Compare int=500 and int=500 is \"%b\"\n", int1 == int2);
        System.out.printf("Compare Integer=500 and Integer=500 is \"%b\"\n",int3 == int4);
        System.out.printf("Compare int=500 and Integer=500 is \"%b\"\n\n",int1 == int4);
        
        int int5 = 10;
        byte byte1 = 10;
        System.out.printf("Compare int=10 and byte=10 is \"%b\"\n\n", int5 == byte1);
        
        Integer int6 = 125;
        Integer int7 = 125;
        Integer int8 = new Integer(125);
        System.out.printf("Compare Integer=125 and Integer=125 is \"%b\"\n", int6 == int7);
        System.out.printf("Compare Integer=125 and Integer=new Integer(125) is \"%b\"\n", int6 == int8);
        int8 = (int) int8.doubleValue();
        System.out.println(int8);

 //       String strInt = String.valueOf(123);
//        String strInt = int7.toString();
        String strInt = Integer.toString(132);
//        Integer intStr = Integer.valueOf("123");
//        Integer intStr = Integer.decode("123");
//        intStr +=1;
//          Integer intStr = Integer.parseInt("123");
        Integer intStr = Integer.parseInt("123");

        System.out.println("From Integer to String - " + strInt + "| From String to Integer"+ intStr);
        
        String strDouble = String.valueOf(123.4);
//        Double doubleStr = Double.valueOf("32");
        Double doubleStr = Double.parseDouble("32.5");
        System.out.println("From Double to String - " + strDouble +  "| From String to double " + doubleStr);


    }

}

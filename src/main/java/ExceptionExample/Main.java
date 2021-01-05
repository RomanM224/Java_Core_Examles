package ExceptionExample;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws MyException{
        MyClass clas = new MyClass();
        ReadFil read = new ReadFil();
        try {
            clas.throwException();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        clas.thowUncheckedException(); // It throws but don't need put in try-catch

//        try {
//            clas.throwMyException();
//        } finally  {
//            System.out.println("Hello");
//            read.read();
//        }
        
    }

}

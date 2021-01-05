package ExceptionExample;

import java.io.IOException;

public class MyClass {
    
    public void throwException()throws IOException{
        throw new IOException("Throw IOException");
    }
    
    public void throwMyException() throws MyException {
        throw new MyException("Throw MyException");
    }
    
    public void thowUncheckedException() {
        throw new ArithmeticException();
    }
}

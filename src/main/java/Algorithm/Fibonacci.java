package Algorithm;

public class Fibonacci {
    
    public static void main(String[] args) {
       //0, 1, 1, 2, 3, 5, 8 
        System.out.println(finonacci(55));
       
    }
    
    public static int finonacci(int n) {
        int fibonacciNum1 = 0; 
        int fibonacciNum2 = 1; 
        if(n >= 2) {
            for(int i = 2; i < n; i++) {
                int tmp = fibonacciNum2;
                fibonacciNum2 = fibonacciNum1 + fibonacciNum2;
                fibonacciNum1 = tmp;
            }
        }
        return fibonacciNum2;
    }

}

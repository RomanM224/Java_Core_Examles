package OverrrideOverload;

public class Man extends Human {

    @Override
    public void say() {
        System.out.println("I am man");
    }

    public void disp(char c) {
        System.out.println(c);
    }

    public int disp(int c) {
        System.out.println(c);
        return c;
    }

    private static void disp(char c, int num) {
        System.out.println(c + " " + num);
    }

    public String getData(){
        return "Employe from Manager";
    }

    public int getData(String val) {
        return 0;
    }
}

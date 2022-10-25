package rw.ac.rca.arthmetic;

public class RuntimeException {
    public static void main(String[] args) {
        System.out.println("Hello from main");
        myMethod();
    }

    static void myMethod() {
        System.out.println("hello from my method");
        myNextHello();
    }

    static void myNextHello() {
        int x = 8/0;
    }

}

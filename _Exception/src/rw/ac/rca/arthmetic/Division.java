package rw.ac.rca.arthmetic;
import java.lang.*;

public class Division {
    public void divide() {
        try {
            int x = 8/0;
            System.out.println(x);
        }catch (Exception exception) {
            System.out.println("exception getMessage : " +  exception.getMessage());
            System.out.println("exception toString : " + exception.toString());
            System.out.println("exception getStackTrace : " + exception.getStackTrace());
            return;

        }finally {
            System.out.println("Inside the finally");
        }
    }
}

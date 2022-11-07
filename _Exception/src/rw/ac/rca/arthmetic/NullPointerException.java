package rw.ac.rca.arthmetic;

public class NullPointerException {
    public static void main(String args[]) {
        String s = null;
        NullPointerException("another-banga");
        NullPointerException(s);
    }

    public static void NullPointerException(String s) {
        try {
            if(s.equals("hello")) {
                System.out.println("String " + s + " is equal to hello");
            }else {
                System.out.println("String s is equal to " + s);
            }
        }catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

}

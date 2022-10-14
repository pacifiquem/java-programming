package Shapes;

public class Shapes {
    /* encapsulation is a way of hiding instance variables by using protected or private key word */

    private int area;
    private int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }


    public void syName() {
        System.out.println("I'm parent class Shapes");
    }
}

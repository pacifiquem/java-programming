package Shapes;

public class Circle extends Shapes {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void syName() {
        System.out.println("I'm child class Circle");
    }
}

package Shapes;

public class Square extends Shapes {
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public void syName() {
        System.out.println("I'm child class Square");
    }
    public void mySpecificName() {
        System.out.println(" Specifically I'm a Square");
    }
}

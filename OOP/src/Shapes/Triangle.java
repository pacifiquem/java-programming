package Shapes;

public class Triangle extends Shapes {
    private float base;
    private float height;
    private float hypotenuse;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(float hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public void mySpecificName() {
        System.out.println(" Specifically I'm a Triangle");
    }

    public void syName() {
        System.out.println("I'm child class Triangle");
    }
}

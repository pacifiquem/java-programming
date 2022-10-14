package Shapes;

public class Rectangle extends Shapes {
    public float width;
    public float length;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void syName() {
        System.out.println("I'm child class Rectangle");
    }
}

package Shapes;

public class InhertanceApp {

    public static void main(String args[]) {
        Shapes superShape1 = new Shapes();
        Shapes superShape2 = new Square();
        Square squareShape = new Square();

        superShape1.syName();
        superShape2.syName();
        squareShape.syName();

    }

}

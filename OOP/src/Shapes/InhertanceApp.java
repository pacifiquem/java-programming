package Shapes;

public class InhertanceApp {

    public static void main(String args[]) {

        Shapes superShape1 = new Shapes();
        Shapes superSquare = new Square();   //Object Casting .
        Shapes superRectangle = new Rectangle();
        Square squareShape = new Square();
        Rectangle rectangleShape = new Rectangle();

        superShape1.syName();
        superSquare.syName();
        squareShape.syName();
        rectangleShape.sayName(superShape1);
        ((Rectangle) superRectangle).mySpecificName(); //this will run because of Object casting .
        // superShapeRectangle.mySpecificName();  //this will throw an Error bcz there is no object Casting .


    }

}

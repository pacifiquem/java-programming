/**
 * 
 */
package rw.ac.rca.shape;

/**
 * @author Aphrodice Rwagaju
 *
 */
public class MainApp {
	
	public static void main(String[] args) {
		//Up casting always works for both implicit or explicit
		//Shape myShape = new Square(); //Creating a Square object  -> Up casting
		//For Triangle everything works fine
		Triangle myShape = new Triangle(); //Creating a Triangle object  -> No casting needed
		
		myShape.sayYourType();
		realShape(myShape);
		
		//Polymorphism
		Shape myyShape = new Shape(); //Creating a Rectangle object
		Shape myRectangle = new Rectangle(); //Creating a Rectangle object -> Up casting
		Shape myTriangle = new Triangle(); //Creating a Triangle object  -> Up casting
		Shape myCircle = new Circle(); //Creating a Circle object  -> Up casting
		Shape mySquare = new Square(); //Creating a Square object  -> Up casting
		
		myyShape.sayYourType();
		myRectangle.sayYourType();
		myTriangle.sayYourType();
		myCircle.sayYourType();
		mySquare.sayYourType();
		
	}
	
	public static void realShape(Shape shape) {
		shape.sayYourType();
		    //The type of variable determine which method to be called
		//hence squareType() is only of type square not any shape type
		//shape.squareType();
		
		//Down casting always requires explicit casting
		//Siblings cast do not mater at compile time but flows exceptions at runtime
//		Square square = (Square) shape;
//		square.squareType();
		
		//instanceof is to avoid class cast exception
		if(shape instanceof Square) {
			Square square = (Square) shape;  //Down casting
			square.squareType();
		} else {
			//Prints the casted class in case not real class passed
			shape.noRealTypeShapeSpecified(shape.getClass());
		}
	}
}

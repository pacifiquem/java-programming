/**
 * 
 */
package rw.ac.rca.shape;

/**
 * @author Aphrodice Rwagaju
 *
 */
public class Square extends Shape {
	
	private float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	
	public void sayYourType() {
		System.out.println("I am sub class Square");
	}
	
	public void squareType() {
		System.out.println("I am only sub class Square");
	}
}

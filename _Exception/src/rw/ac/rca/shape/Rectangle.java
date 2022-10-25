/**
 * 
 */
package rw.ac.rca.shape;

/**
 * @author Aphrodice Rwagaju
 *
 */
public class Rectangle extends Shape {
	
	private float height;
	private float width;
	
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	
	public void sayYourType() {
		System.out.println("I am sub class Rectangle");
	}
}

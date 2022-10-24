/**
 * 
 */
package rw.ac.rca.shape;

/**
 * @author Aphrodice Rwagaju
 *
 */
public class Triangle extends Shape {
	
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
	@Override
	public void sayYourType() {
		System.out.println("I am sub class Triangle");
	}
	
	@Override
	public String toString() {
		return "Triangle [height=" + height + ", width=" + width + "]";
	}
	
}

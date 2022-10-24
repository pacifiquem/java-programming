/**
 * 
 */
package rw.ac.rca.shape;

/**
 * @author Aphrodice Rwagaju
 *
 */
public class Shape {
	
	private int color;
	private float area;
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	
	public void sayYourType() {
		System.out.println("I am super class Shape");
	}
	
	public void noRealTypeShapeSpecified(Class<?> clazz) {
		System.out.println("I am super class method and someone tried to cast to a different sibling class: "+ clazz.getName());
	}
}

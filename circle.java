//package learning;
import java.util.Scanner;

class circle_prop{
	private float r;
	private float area;
	private float perimeter;
	
	public float getRadius(){
		return r;
	}
	public void setRadius(float rad){
		r=rad;
	}
	public float getArea(){
		return area;
	}
	public float getPerimeter(){
		return perimeter;
	}
	public void setArea(float r){
		area=3.14f*r*r;
	}
	public void setPerimeter(float r){
		perimeter=2*3.14f*r;
	}
}
public class circle {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		circle_prop c1=new circle_prop();
		System.out.println("Enter the radius");
		float rad=sc.nextFloat();
		c1.setRadius(rad);
		System.out.println(c1.getRadius());
		c1.setArea(rad);
		c1.setPerimeter(rad);
		System.out.println("Area is --"+c1.getArea());
		System.out.println("Perimeter --"+c1.getPerimeter());
	}

}

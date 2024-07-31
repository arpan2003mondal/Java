package learning;
class cylinder{
	private float radius;
	private float height;
	
	public cylinder(){
		radius=3f;
		height=9f;
	}
	
	public cylinder(float r,float h){
		radius=r;
		height=h;
	}							//---- Constructors
	
	
	public void setRadius(float r){
		radius=r;
	}
	public void setHeight(float h){
		height=h;
	}
	public float getRadius(){
		return radius;
	}
	public float getHeight(){
		return height;
	}
	public double volume(){
		return Math.PI*radius*radius*height;
	}
	public float area(){
		return (float)Math.PI*radius*2*(radius+height);
	}
}
public class practiceaet9 {
	
	public static void main(String[] args){
		
		cylinder c=new cylinder(9,12);
		
		//c.setRadius(9f);
		//c.setHeight(12f);
		System.out.println("Radius is "+c.getRadius());
		System.out.println("Height is "+c.getHeight());
		System.out.printf("Volume of the cylinder is %.2f\n",c.volume());
		System.out.printf("Surface area is %.2f",c.area());
	}

}

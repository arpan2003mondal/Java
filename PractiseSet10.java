package learning;

class Circle1{
	public float radius;
	public Circle1(float r){
		this.radius=r;
	}
	public Circle1(){
		System.out.println("I am in circle class");
	}
	public void setRadius(float r){
		this.radius=r;
	}
	public double area(){
		return Math.PI*this.radius*this.radius;
	}
}

class Cylinder1 extends Circle1{
	float height;
	public Cylinder1(float r,float h){
		super(r);
		this.height=h;
	}
	public void setHeight(float h){
		this.height=h;
	}
	public Cylinder1(){
		System.out.println("I am in cylinder class");
	}
	public double volume(){
		return this.height*Math.PI*this.radius*this.radius;
	}
}

public class PractiseSet10 {

	public static void main(String args[]){
		Circle1 c=new Circle1(3);
	//	c.setRadius(3);
		System.out.println(c.area());
		
		Cylinder1 c1=new Cylinder1(3,2);
		///c1.setHeight(5);
		//c1.setRadius(4);
		//System.out.println(c1.volume());
	}
}

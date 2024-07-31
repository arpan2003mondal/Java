package learning;


class Base{
	int x;
	
	public int getX(){
		return x;
	}
	public void setX(int x){
		System.out.println("I am in Base Class now and setting X");
		this.x=x;
	}
	public void printMe(){
		System.out.println("I am a constructor");
	}
}

class Derived extends Base{
	int y;
	
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y=y;
	}
}
public class inheritance {

	public static void main(String args[]){
		
		// Creating an object from base class 
		Base b=new Base();
		b.setX(67);
		System.out.println(b.getX());
		
		// Creating an object from derived class
		Derived d= new Derived();
		d.setX(8);
		System.out.println(d.getX());
		
		 // Creating an object from derived class and getting value of y
		Derived a=new Derived();
		a.setY(33);
		System.out.println("Derived Y "+a.getY());
	}
}

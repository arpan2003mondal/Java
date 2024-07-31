package learning;

interface Bicycle{
	int a=45;  
	//you can create properties in interfaces
	void applyBrake(int decrement);
	void speedUp(int increment);
}

interface Horn{
	void blowHorn12();
	void blowHorn15();
}
class AvonCycle implements Bicycle,Horn{     // implementing two interfaces in one class
	void blowHorn(){
		System.out.println("Blowing horn -- Pee poo ");
	}
	public void applyBrake(int decrement){
		System.out.println("Applying Barke");
	}
	public void speedUp(int increment){
		System.out.println("Applying Speedup");
		
	}
	
	public void blowHorn12(){
		System.out.println("Horn is song 12");
	}
	
	public void blowHorn15(){
		System.out.println("Horn is song 15");
	}
}

public class Interface {

	public static void main(String args[]){
		AvonCycle cycle1=new AvonCycle();
		cycle1.applyBrake(2);
		System.out.println(cycle1.a);
		cycle1.blowHorn();
		// you cannot modify the properties in Interfaces as they are final
		//cycle1.a=87; --- Error
		
		cycle1.blowHorn12();
	}
}

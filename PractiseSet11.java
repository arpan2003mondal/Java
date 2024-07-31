package learning;
//Q1
abstract class Pen{
	abstract void refill();
	abstract void write();
}

class Functions extends Pen{
	void refill(){
		System.out.println("Refilling");
	}
	void write(){
		System.out.println("Writing");
	}
}
class FountainPen extends Functions{
	void changeNib(){
		System.out.println("Changing the nib");
	}
}
//Q2
class Monkey{
	public void jump(){
		System.out.println("Jumping");
	}
	public void bite(){
		System.out.println("Biting");
	}
}
interface BasicAnimal{
	void sleep();
	void eat();
}
class Human extends Monkey implements BasicAnimal{
	public void sleep(){
		System.out.println("Sleeping");
	}
	public void eat(){
		System.out.println("Eating");
	}
}

//Q3
abstract class Telephone{
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
}

class Smartphone extends Telephone{
	void ring(){
		System.out.println("Ringing");
	}
	void lift(){
		System.out.println("Lifting");
	}
	void disconnect(){
		System.out.println("Disconnecting");
	}
}
public class PractiseSet11 {

	public static void main(String args[]){
		//Question 1
//		Functions f=new Functions();
//		f.refill();
//		f.write();
//		FountainPen f1=new FountainPen();
//		f1.changeNib();
		
		// Question 2
		/*Human arpan =new Human();
		arpan.sleep();
		arpan.eat();
		Monkey m=new Human();
		m.bite();*/
		
		//Question 3
		Smartphone poco=new Smartphone();
		poco.ring();
		poco.disconnect();
	}
}

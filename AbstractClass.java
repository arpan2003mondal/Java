package learning;

abstract class Parent{
	 Parent(){
		System.out.println("I am in abstract class");
	}
	
	abstract void greet();
	abstract void walk();   // abstract class has no existance we have to override or create abstract class
	
}

class Child extends Parent{
	@Override
	public void greet(){
		System.out.println("Good Morning");
	}
	@Override
	public void walk(){
		System.out.println("Walking");
	}
	
}

abstract class Child2 extends Parent{
	public void run(){
		System.out.println("Running");
	}
}
public class AbstractClass {
	public static void main(String args[]){
		Child c=new Child();
		c.greet();
		//Parent p=new Parent();---error
		//Child2 c2=new Child2();---error
		
		Parent p=new Child();  // object creation using abstarct reference
		p.walk();
	}

}

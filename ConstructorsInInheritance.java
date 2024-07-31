package learning;

class Base1{
	int b;
	public void setB(int b){
		this.b=b;
	}
	 Base1(){// these are defaults
		System.out.println("I am in base class constructor");
	}
	
	 Base1(int n){
		 System.out.printf("Base class constructor: n->%d \n",n);
	 }
	 
	 Base1(int m,int n){
		 System.out.printf("Base class constructor: m->%d n->%d\n",m,n);
	 }
}

class Derived1 extends Base1{
	Derived1(){
		super(3);
		System.out.println("I am in Derived class constructor");
	}
	
	Derived1(int m){
		//super(6,6);   // here derived has one parameter but base is called with two parameter
		
		// it is not that if we pass one parameter to derived class then is possbile that the derived
		// class can call base class with two parameter it will give no error
		System.out.printf("Derived Class: m->%d\n",m);
	}
	
	Derived1(int m,int n){
		super();// the super keyword invokes the parent constructor with same parameter
		System.out.printf("Derived Class: m->%d n->%d\n",m,n);
	}
}
class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

public class ConstructorsInInheritance {

	public static void main(String[] args){
		//Base1 b =new Base1();
		//Derived1 d=new Derived1();  
		/*  when derived class object is created then it will first call the 
			base class constructor and then derived class constructor*/
		
		//Base1 b=new Base1(5);  // this object refers to the second constructor of base class
		
		//Derived1 d=new Derived1(2);
		ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
	}
}

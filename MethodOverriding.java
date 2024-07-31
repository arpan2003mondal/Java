package learning;
class A{
	public void meth1(){
		System.out.println("I am method 1 of class A");
	}
	public void meth2(){
		System.out.println("I am method 2 of class A");
	}
}
class B extends A{
	@Override              
	public void meth2(){
		System.out.println("I am method 2 of class B");   
		// here method2 of class B overrides the method of class A
		// two methods are not same each are different
	}
	public void meth3(){
		System.out.println("I am method 3 of class B");
	}
}

// method overloading -- in same class
//method overriding -- in different class uses inheritence 
public class MethodOverriding {

	public static void main(String args[]){
		A a=new A();
		a.meth2();
		
		B b=new B();
		b.meth2();
		b.meth1();
	}
}

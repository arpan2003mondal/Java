package learning;

interface Sample{
	void meth1();
	void meth2();
}

interface Model extends Sample{   //inheritance can be implemented using interface
									// here Model is implemented using Sample
	void meth3();
	void meth4();
	
}

class Product implements Model{
	public void meth1(){
		System.out.println(" Calling Meth 1");
	}
	public void meth2(){
		System.out.println("Calling Meth 2");
	}
	public void meth3(){
		System.out.println("Calling Meth 3");
	}
	public void meth4(){
		System.out.println("Calling Meth 4");
}
}
public  class InheritanceInInterface {

	public static void main(String args[]){
		Product p=new Product();
		p.meth1();
	}
}

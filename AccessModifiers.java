package learning;

class C1{
	public int x=4;  //can be accessed by class,package,subclass,world
	protected int y=7;// can be accessed by class,package,subclass
	int z=1;//can be accessed by class,package
	private int a=6;// can be accessed by class
	 public void meth1(){
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
		 System.out.println(a);
	 }
	
}
public class AccessModifiers {

	public static void main(String args[]){
		C1 c=new C1();
		//c.meth1();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
//		System.out.println(c.a);   // private modifiers can not be accessed in same package
	
	}
}

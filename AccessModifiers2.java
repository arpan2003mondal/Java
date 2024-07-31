package learning;
import learning.C1;
class Using extends C1{
	void meth(){
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
//	System.out.println(a);
	}
}
public class AccessModifiers2 {

	public static void main(String args[]){
		 Using u=new Using();
		u.meth();
//		System.out.println(cc.x);
//		System.out.println(cc.y);
//		System.out.println(cc.z);
//		//System.out.println(cc.a);
	}
}

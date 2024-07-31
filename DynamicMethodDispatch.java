package learning;

class Phone{
	public void time(){
		System.out.println("Time is 10:45 am");
	}
	
	public void on(){
		System.out.println("Turning on Phone....");
	}
}

class SmartPhone extends Phone{
	public void greet(){
		System.out.println("Good Morning");
		}
	public void on(){
		System.out.println("Turning on SmartPhone...");
	}
	}
public class DynamicMethodDispatch {
	public static void main(String args[]){
		//Phone nokia=new Phone();// this is allowed
		//SmartPhone poco=new SmartPhone();  // this is allowed
		//poco.on();
		
		Phone mi=new SmartPhone();  // this is also allowed .....
		//creating an object SmartPhone using Phone's reference
		// super class reference in sub class is allowed
		
		
		//using dynamic dispatch only Phones methods can be accessed
		mi.on();
		mi.time();
		//mi.greet();    //--- this will produce error
		
		
		//SmartPhone lava=new Phone();  ----> this is not allowed
		// we cannot use phone as smartphone in normal life
		// subclass reference in superclass is not allowed
	}

}

package learning;

class myMainEmployee{
	private int id;
	private String name;
	
	public myMainEmployee(){  // this will be called when no parameeter is passes
		id=45;
		name="Swagata";
	}
	public myMainEmployee(int i,String n){   // when two parameters are passed
		id=i;
		name=n;
	}
	public myMainEmployee(int i){  // when one parameter is passed
		id=i;
		
	}                        // these are constructor overloading
	
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public void setName(String n){
		name=n;
	}
	public void setId(int i){
		id=i;
	}
}
								// constructors are used to set values for the class main-employee
public class constructors { 
	public static void main(String[] args){
		myMainEmployee riju=new myMainEmployee(11,"Arpan Mondal");
		myMainEmployee mana=new myMainEmployee(32) ;  // using constructor id is assigned value 32
		//riju.setId(12);								// but name is assigned to null
		//riju.setName("Arpan Mondal");
		System.out.println(riju.getName());
		System.out.println(riju.getId());
		System.out.println(mana.getName());
		System.out.println(mana.getId());
	}

}

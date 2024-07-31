package learning;

class myEmployee{
	private int id;
	private String name;  // in private access modifier it is not possible to assign values by dot
						// operator,it can be possible by creating methods and assign value to it
	
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
public class accessModifier {
	public static void main(String[] args){
		myEmployee arpan=new myEmployee();
//		arpan.id=201;
//		arpan.name="Arpan Mondal";
//		System.out.println(arpan.id);----> this will produce error due to private access modifier
		
		arpan.setName("Arpan Mondal");
		arpan.setId(101);
		System.out.println(arpan.getName());
		System.out.println(arpan.getId());
		
	}

}

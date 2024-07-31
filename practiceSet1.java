package learning;

class Worker{
	int salary;
	String name;
	//int salary;
	public int getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name=n;
	}
	
}


public class practiceSet1 {
	public static void main(String[] args){
		// problem 1
		Worker arpita=new Worker();
		arpita.name="Arpita Mondal";
		arpita.salary=40000;
		System.out.println(arpita.getName());
		System.out.println("Salary-- "+arpita.getSalary());
		arpita.setName("Arpita Hensh");
		System.out.println("New name--"+arpita.name);
	}
}

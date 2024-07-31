package learning;

 class Employee{
	 int id;
	String name;
	int salary;
	public void printDetails(){
		System.out.println("My id is "+id);
		System.out.println("My name  is "+name);
		
	}
	public int getSalary(){
		return salary;
	}
}

public class javaCustomClass {
	public static void main(String[] args){
		System.out.println("This is our custom class");
		Employee arpan=new Employee();  // Instantiating a new Employee object
		Employee kiran=new Employee();
		// Setting attributes for arpan
		arpan.id=101;
		arpan.name="Arpan Mondal";
		arpan.salary=10;
		
		kiran.id=102;
		kiran.name="Kiran Mondal";
		kiran.salary=30;
		
		// Printing attributes
		
		arpan.printDetails();
		kiran.printDetails();
		int salary=kiran.salary;
		System.out.println("Kiran salary is "+salary);
		
		//System.out.println(arpan.id);
		//System.out.println(arpan.name);
	}

}

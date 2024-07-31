package learning;

public class methods {
	int logic(int p,int q){
		int r;
		r=p+q;
		return r;
	}
	void output(int age){
		if(age>18)
			System.out.println("You are adult");
		else
			System.out.println("Not adult");
	}
	
	static void change2(int [] arr){
        arr[0] = 98;
	}
	static int sum(int x,int y){
	int z;
	if(x>y)
		z=x+y;
	else
		z=x+y+3;
	return z;
}
	static void none(int a){
		System.out.println("hi "+a);
	}
	static void none(int a,int b){
		System.out.println("hi "+a+"\t hi "+b);
	}
	static void none(int a,int b,int c){
		System.out.println("hi "+a+"\t hi "+b+"\t hi "+c);
	}

	
	
	
	
	
	public static void main(String[] args){
	int a=3,b=5;
	int c=sum(a,b);
	System.out.println("Sum is "+c);
	
	// Method invocation using Object creation
	
	methods obj=new methods();
	int x=obj.logic(3,5);
	System.out.println(x);
	
	obj.output(22);
	
	 // Case 1: Changing the Array
     int [] marks = {52, 73, 77, 89, 98, 94};
     change2(marks);
     System.out.println("The value of x after running change is: " + marks[0]);

	
	// Method overloading
	none(100);
	none(200,100);
	none(100,200,300);
	
	// method overloading can be possible by changing the number of Arguements
	// it can not be possible by changing the return type------ void none();int none()--> error
	
	
	
	
}
}

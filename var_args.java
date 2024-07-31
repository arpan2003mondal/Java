package learning;

public class var_args {
	static void sum(int ...arr){			//---> this may produce output with no input
		int sum=0;
		for(int i:arr)
			sum+=i;
		System.out.println("Sum is "+sum);
	}
	static void sum1(int x,int ...arr){        //---> this takes at least one input
		int sum=0;
		for(int i:arr)
			sum+=i;
		System.out.println("Sum is "+sum);
	}
	public static void main(String[] args){
		//----------VarArgs-------------:  varargs are used to a task over several inputs , 
		//it uses an array to store the inputs
		sum();
		sum(1);
		sum(3,5);
		sum(8,4);
		sum(6,4,9);
		
	//---> Error--->	sum1();
		sum1(6);
		sum1(7,5);
		sum1(4,4);
		sum1(6,7,4,9);

		
		
	}

}

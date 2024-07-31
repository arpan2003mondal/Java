package learning;
import java.util.Scanner;

public class practice_set7 {
	static void table(int n){
		
		for(int i=1;i<=10;i++){
			System.out.print("  "+n*i);
		}
	}
	
	static int sum(int n,int sum){
		
		if(n==1)
			return sum;
		else {
			sum=sum+n;
			return sum(n-1,sum);
		}
	}
	int fibo(int n){
		if(n==1 || n==2)
			return n-1;
		else
			return fibo(n-1)+fibo(n-2);
	}
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	//---- 1.table printing
	
//	System.out.println("Enter the number");
//	int n=sc.nextInt();
//	
//	System.out.printf("Multiplication table of %d is ",n);
//	table(n);
	
	//--2. sum calc using recursion
	
//	System.out.println("Enter how many numbers you take");
//	int n=sc.nextInt();
//	int ans=sum(n,1);
//	System.out.format("Sum of first %d number is %d",n,ans);
	
	// 3. fibonacci series
	System.out.println("Enter how many numbers you take");
	int n=sc.nextInt();
	practice_set7 obj=new practice_set7();
	System.out.printf("%d term of fibonacci series is %d",n,obj.fibo(n));
	}

}

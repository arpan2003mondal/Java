package learning;

import java.util.Scanner;
public class factorial_rec {
	static int fact_rec(int n){
		if(n==0 || n==1)
			return 1;
		else
			return n*fact_rec(n-1);
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.format("Factorial of %d is %d ",num,fact_rec(num));
		
	}

}

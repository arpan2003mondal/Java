package learning;
import java.util.Scanner;
public class factorial_calculation {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i,fact=1;
		for(i=n;i>0;i--)
			fact=fact*i;
		System.out.printf("Factorial is "+fact);
	}

}

package learning;
import java.util.Scanner;
public class practice_set {
	
	public static void main(String[] args){
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the number 1:");
	int num1=num.nextInt();
	System.out.println("Enter the number 2:");
	int num2=num.nextInt();
	System.out.println("Enter the number 3:");
	int num3=num.nextInt();
	int sum=num1+num2+num3;
	//System.out.println("Sum of %d,%d,%d is %d"+num1,num2,num3,num1+num2+num3);
	System.out.println("Sum 0f these numbers is");
	System.out.println(sum);
}
}
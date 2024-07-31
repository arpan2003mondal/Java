package learning;
import java.util.Scanner;

public class calculator_SwitchCase {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("Enter the operation:\n1-->'+'\n2--> '-'\n3--> '*'\n4--> '/'");
		int choice=input.nextInt();
		float ans = 0;
		switch(choice){
		case 1: ans=num1+num2;
				break;
		case 2: ans=num1-num2;
				break;
		case 3: ans=num1*num2;
				break;
		case 4: ans=(float)num1/num2;
				break;
		}
		System.out.println(ans);
	}

}

package learning;
import java.util.Scanner;

public class java_conditional {
public static void main (String[] args){
	Scanner age=new Scanner(System.in);
	System.out.print("Enter your age: ");
	int my_age= age.nextInt();
	if(my_age>18){
		System.out.println("You can drive.");
	}
	else{
		System.out.println("You cannot drive!");
	}
}
}

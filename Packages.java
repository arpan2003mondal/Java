package learning;

//import java.util.Scanner;   //--  this package is used for taking inputs from user
//import java.util.*;        //  this package imports all util packages
public class Packages {

	public static void main(String args[]){
		//Scanner sc = new Scanner(System.in);  // this needs to import Scanner class
		java.util.Scanner sc = new java.util.Scanner(System.in);  // directly import Scanner class
		System.out.println("This is a Scanner Class");
		System.out.println("Enter number");
		int a=sc.nextInt();
		System.out.println("The number is "+a);
		
	}
}

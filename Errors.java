package learning;

import java.util.Scanner;

public class Errors {

	public static void main(String[] args){
		
		// Syntax error examples
		/* int a
		b=20;  */
		
		// Logical error example
		// Write a program to print all prime numbers between 1 to 10
     /*   System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1); */
		
		// RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}


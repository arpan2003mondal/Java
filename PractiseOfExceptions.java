package learning;
import java.util.Scanner;

public class PractiseOfExceptions {
	public static void main(String []args){
		// question 1
		//Syntax Error
		///int a==10    -->  this is a syntax error
		
		// logical error
		/*int num=8;
		if(num%2==0)
			System.out.println("Not Prime Number");   -->this is a logical error
		*/
		// runtime error
		//System.out.println(5/0);
		
		// question 2
		/*int a=32,b=0;
		int c;
		try{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("HaHa");
		}
		catch(IllegalArgumentException e){
			System.out.println("HeHe");
		}*/
		
		// question 3
		int []arr={12,21,32,45,54};
		int index,i=0;
		Scanner sc=new Scanner(System.in);
		while(true && i<5){
			System.out.println("Enter array index ");
			index=sc.nextInt();
			try{
				System.out.println("Element is "+arr[index]);
				break;
			}
			catch(Exception e){
				System.out.println("Error out of index");
				i++;
				//break;
				if(i==5){
					System.out.println("Maximum tries reached,please try again");
				}
			}
			
		}
		
	}

}

package learning;
import java.util.Scanner;
public class ExceptionMethods {

	public static void main(String args[]){
		int []marks={8,9,6};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index number");
		int ind=sc.nextInt();
		System.out.println("Enter the number you want ot divide with");
		int num=sc.nextInt();
		
		try{
			try{
			System.out.println("Value at array index is "+marks[ind]);
			System.out.println("After dividing answer is "+marks[ind]/num);
		}
			catch(ArithmeticException e){
			System.out.println("Arithmetic Exception Occurred");
			System.out.println(e);
			e.printStackTrace();
			
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
		}
		catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
		}	
}

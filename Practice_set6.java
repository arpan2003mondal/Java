package learning;
import java.util.Scanner;

public class Practice_set6 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Question 1 array of 5 float and calculate their sum
		/*float []arr={5.3f,8.9f,2.5f,7.4f,6.6f};
		float sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		System.out.print("Sum of 5 elements is ");
		System.out.println(sum);*/
		
		// Question 2 ----- element is present or not
//		int []num={2,1,6,8,9,4,7};
//		System.out.println("Enter name you want to find");
//		int find=sc.nextInt();
//		int i=0;
//		for(i=0;i<num.length;i++){
//			//System.out.println(i);
//			//y=i;
//			if(num[i]==find){
//				System.out.printf("The number is present at position "+(i+1));
//				break;
//			}
//		}
//
//	if(i==7)
//		System.out.println("The element is not present");
		
		//Question 3------- calculate the average from array
		float []marks={94.4f,57.5f,73.2f,81.9f,78.4f,91.1f};
		float sum=0;int i=0;
		for(i=0;i<marks.length;i++){
			sum=sum+marks[i];
		}
		System.out.println(sum);
		System.out.println("Average marks in physics is");
		System.out.println(sum/marks.length);
		
		
		
	}
}

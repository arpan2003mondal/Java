package learning;
import java.util.Scanner;

public class practice_set4 {
public static void main(String[] args){
	// Question2 -> marks calculation
//	Scanner marks=new Scanner(System.in);
//	System.out.println("Enter full marks");
//	float fullmarks= marks.nextFloat();
//	System.out.println("Enter the marks of 3 subject ");
//	float sub1=marks.nextFloat();
//	float sub2=marks.nextFloat();
//	float sub3=marks.nextFloat();
//	float per=(sub1+sub2+sub3)*100/(fullmarks*3);
//	System.out.println(per);
//	float s1=(sub1*100)/fullmarks;  // to calculate each subject percentage
//	float s2=(sub2*100)/fullmarks;
//	float s3=(sub3*100)/fullmarks;
//	if(per>=40 && s1>=33 && s2>=33 && s3>=33)
//		System.out.println("PASS");
//	else
//		System.out.println("FAIL");
	
	
	// question3 -> income tax calculation
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter your salary");
//	float salary=sc.nextFloat();
//	float tax=0;
//	System.out.print("Your calculated tax is ");
//	if(salary>250000f && salary<=500000f){
//		tax= tax + .05f*(salary-250000f);
//		System.out.println(tax);
//	}
//		
//	else if(salary>500000 && salary<=1000000){
//		tax=tax+ 0.05f*(250000f);
//		tax=tax+ 0.2f*(salary-500000f);
//		System.out.println(tax);
//	}
//	else if(salary>1000000){
//		tax=tax+ 0.05f*(250000f);
//		tax=tax+ 0.2f*(500000f);
//		tax=tax+0.3f*(salary-1000000f);
//		System.out.println(tax);
//	}
//	else
//		System.out.println(tax);
//			
//	
//}
//}
	
	// question 4 -> input- numbers;output- which day
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter day number");
//	int day=sc.nextInt();
//	switch(day){
//	case 1:System.out.println("It is Monday");
//			break;
//	case 2:System.out.println("It is Tuesday");
//			break;
//	case 3:System.out.println("It is Wednesday");
//			break;
//	case 4:System.out.println("It is Thursday");
//			break;
//	case 5:System.out.println("It is Friday");
//			break;
//	case 6:System.out.println("It is Saturday");
//			break;
//	case 7:System.out.println("It is Sunday");
//			break;
//	
//			
//	}
	
	// Question- 5 -> given year leap year or not
	
//	Scanner sc=new Scanner(System.in);
//	System.out.print("Enter the year");
//	int year=sc.nextInt();
//	if(year%400==0)
//			System.out.println("This is a leap year");
//	else if(year%4==0 && year%100!=0)
//		System.out.println("This is a leap year");
//	else
//		System.out.println("Not leap year");

	// Question 6-> find type of url
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the website");
	String website=sc.next();
	if(website.endsWith(".com"))
		System.out.println("Commercial Website");
	else if(website.endsWith(".org"))
		System.out.println("Organisation Website");
	else if(website.endsWith(".in"))
		System.out.println("Indian Website");
	else
		System.out.println("This is other website");
}
}

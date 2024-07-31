package learning;
import java.lang.Math;
public class Array_reverse {
	public static void main(String[] args){
		int []arr={1,2,3,4,5,6,7,8,9};
		int l=arr.length,temp,i;   // last is the position to swap one with the another
		///int n= Math.floorDiv(l,2);
		for(i=0;i<l/2;i++){
			temp=arr[i];
			arr[i]=arr[l-1-i];
			arr[l-i-1]=temp;
			
		}
		System.out.println("Number of iterations are"+i);
		System.out.println("After reversing the array is");
		for(int element:arr)
			System.out.print(element+" ");
	}
}

package learning;

public class IsArraySorted {
public static void main(String[] args){
	int []arr={21,76,99,43,23,56};
	int temp1,temp2,i=0;
	while(i<arr.length){
		temp1=arr[i+1];
		temp2=arr[i+2];
		if(arr[i]<=temp1){
			if(temp1<=temp2)
				i++;
			else
				break;
			}
		else if(arr[i]>=temp1){
			if(temp1>=temp2)
				i++;
			else
				break;
		}
		
	}
	if(i==arr.length)
		System.out.println("The list is in sorted order");
	else{
		System.out.println("The list is not in sorted order.");

	}
}
}

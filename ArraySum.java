package learning;

public class ArraySum {
	
	public static void main(String args[])
	{
	int[] a=new int[]{2,4};
	int sum=0;


	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	int s=sum/a.length;

	System.out.print(s);


	}

	}


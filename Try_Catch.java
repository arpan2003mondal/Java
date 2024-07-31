package learning;

public class Try_Catch {
	public static void main(String args[]){
		int a=500;
		int c,b=0;
		// without catch
		//System.out.println("Answer is "+(float)a/b);
		// when value of b =0 then this will produce error
		
		// With Try-Catch block
		
		try{
			c=a/b;
			System.out.println("Integer part is "+c);
			
		}
		catch(Exception e){
			System.out.println("Failed to generate answer due to Reason:");
			System.out.println(e);
		}
		System.out.println("End of Program");
	}

}

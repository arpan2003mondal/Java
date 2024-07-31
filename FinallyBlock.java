package learning;

public class FinallyBlock {
	public static int greet(){
		try{
		    int a=20;int b=2;int c=a/b;
			return c;
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{ 		// finally class always executes the program,no matter error or return occur
			System.out.println("Finally Class is running!!");
		}
		return 0;
	}
	public static void main(String args[]){
		int k=greet();
		System.out.println(k);
		int i,a=30,b=5;
		for(i=b;i>=0;i--){
			System.out.println(i);
			try{
				int x=a/i;
				
			}
			catch(Exception e){
				System.out.println(e);
				break;
			}
			finally{					//finally alaways executes even if break occurs
				//System.out.println(i);
				System.out.println("I am Finally.");
			}
		}
		try{
			System.out.println(40/3);
		}
		finally{
			System.out.println("Finally ....");
		}
	}
}

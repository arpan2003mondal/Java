package learning;
class NegativeRadiusException extends Exception{
	@Override
	 public String toString(){
		return "Radius cannot be negative";
	}
	@Override
	public String getMessage(){
		return "Radius cannot be negative!!";
	}

public static class ThrowVsThrows {
	
	public static int  divide(int a,int b)throws ArithmeticException{
		return a/b;
	}
	
	public static double area(float r)throws NegativeRadiusException{
		if(r<0){
			throw new NegativeRadiusException();
		}
		double result=Math.PI*r*r;
		return result;
	}
	public static void main(String args[]){
		int c;double ar;
		try{
			//c=divide(6,0);
			//System.out.println(c);
			ar=area(6);
			System.out.println(ar);
			
		}
		catch(Exception e){
			System.out.println(e);
	}
	}
}
}

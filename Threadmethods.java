package learning;
class MyThre1 extends Thread{
	
	public void run(){
		int i=0;
		while(i<4000){
		System.out.println("Hello World ");
			i++;
		
	}
		
	}
}
class MyThre2 extends Thread{
	
	public void run(){
		int i=0;
		while(i<4000){
		System.out.println("Hello Beautiful World ");
			i++;
		
	}
		
	}
}
public class Threadmethods {

	public static void main(String args[]){
		MyThre1 m1=new MyThre1();
		MyThre2 m2=new MyThre2();
		
		m1.start();
		try{
			m1.start();
		}
		catch(Exception e){
			System.out.println(e);
		}
		m2.start();
	}
	                                    
}

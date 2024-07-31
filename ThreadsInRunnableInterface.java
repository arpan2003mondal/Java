package learning;

class MyThreadRunnable1 implements Runnable{
	public void run(){
		int i=0;
		while(i<4500){
		System.out.println("Mana");
		i++;
	}
	}
}
class MyThreadRunnable2 implements Runnable{
	public void run(){
		int i=0;
		while(i<4500){
		System.out.println("Riju");
		i++;
	}
	}
}
	
	
	public class ThreadsInRunnableInterface {
		public static void main(String args[]){
			MyThreadRunnable1 m1=new MyThreadRunnable1();
			Thread t1 =new Thread(m1);
			MyThreadRunnable2 m2=new MyThreadRunnable2();
			Thread t2= new Thread(m2);
			t1.start();
			t2.start();
			
}

}

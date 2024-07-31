package learning;
class MyThr1 extends Thread{
	public MyThr1(String name){	// this is a thread constructor
		super(name);
	}
	public void run(){
		int i=0;
		//System.out.println("I am cooking now");
		while(i<400){
		System.out.println("Hello World "+this.getName());
			i++;
		
	}
		
	}
}
public class ThreadPriority {    // thread priorities executes the thread which has most priority
	public static void main(String args[]){
		// priorities can be set using .setPriority method
	MyThr1 t1=new MyThr1("Thread 1 (most important...)");
	MyThr1 t2=new MyThr1("Thread 2 ");
	MyThr1 t3=new MyThr1("Thread 3");
	MyThr1 t4=new MyThr1("Thread 4 ");
	MyThr1 t5=new MyThr1("Thread 5 ");
	
	t1.setPriority(Thread.MAX_PRIORITY);
	t1.setPriority(Thread.MIN_PRIORITY);
	t1.setPriority(Thread.MIN_PRIORITY);
	t1.setPriority(Thread.MIN_PRIORITY);
	t1.setPriority(Thread.MIN_PRIORITY);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	}

}

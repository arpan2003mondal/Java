package learning;

class MyThr extends Thread{
	public MyThr(String name){	// this is a thread constructor
		super(name);
	}
	public void run(){
		int i=0;
		System.out.println("I am cooking now");
		//while(i<400){
		//System.out.println("I am cooking now");
		//	i++;
	//}
	}
}

public class ThreadsConstrutctor {
	public static void main(String args[]){
		MyThr t1=new MyThr("Arpan");
		MyThr t2=new MyThr("Swagata");	// assigning thread name
		t1.start();
		t2.start();
		System.out.println("Thread t1 id is "+t1.getId());	// .getId returns the current thread id
		System.out.println("Thread t1 name is "+t1.getName()); // .getName returns the current thread
																// name assigned to it
		System.out.println("Thread t2 id is "+t2.getId());
		System.out.println("Thraed t2 name is "+t2.getName());
	}

}

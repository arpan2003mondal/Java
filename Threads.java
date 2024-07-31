package learning;

class MyThread1 extends Thread{  		// extends thread means importing thread
	@Override
	public void run(){
		int i=0;
		while(i<400){
			System.out.println("I am cooking now");
			i++;
	}
	}
}

class MyThread2 extends Thread{
	@Override
	
	public void run(){
		int i=0;
		while(i<400){
			System.out.println("I am chatting with Mana");
			i++;
	}
	}
}

public class Threads {
	// threads are used to implement multiple task by single processor
	// here mythread1 will be called for sometime and other will be called for sometime and thus goes on
	public static void main(String args[]){
		MyThread1 t1 = new MyThread1();
		MyThread2 t2=new MyThread2();
		
		t1.start();			// start is used to start the thread process,it will call the set func
		t2.start();
	}

}

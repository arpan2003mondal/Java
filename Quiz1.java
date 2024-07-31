package learning;

class Animal{
	String a;

	public void setName(String a){
		this.a=a;
	}
	public void printMe(){
		System.out.printf("Hello,my name is %s I am an animal\n",a);
	}
}

class Dog extends Animal{
	String d;
	public void printD(){
		System.out.println("I am a dog");
	}
	public void hungry(){
		System.out.printf("%s is hungry now",a);
	}
}

public class Quiz1 {

	public static void main(String args[]){
			Dog pet=new Dog();
			pet.setName("Jojo");
			pet.printMe();
			pet.printD();
			pet.hungry();
	}
}

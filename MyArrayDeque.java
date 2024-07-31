package learning;

import java.util.ArrayDeque;

public class MyArrayDeque {

	public static void main(String [] args){
		ArrayDeque<Integer> ad1=new ArrayDeque<Integer>();
		
		ad1.add(11);
		ad1.add(43);
		ad1.add(12);
		ad1.addFirst(56);
		ad1.addLast(87);
		ad1.removeFirst();
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
	}
}

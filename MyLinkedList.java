package learning;
import java.util.*;

public class MyLinkedList {

	public static void main(String [] args){
		LinkedList<Integer> l1=new LinkedList<Integer>();
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(12);
		l2.add(32);
		l2.add(24);
		l2.add(9);
		l1.add(5);
		l1.add(7);
		l1.add(2);
		l1.add(0,8);
		l1.add(9);
		l1.set(3,457);
		//l1.remove(2);
		l1.addAll(l1.size(),l2);
		
		l1.addFirst(876);
		l1.addLast(432);
		for(int i=0;i<l1.size();i++)
			System.out.print(l1.get(i)+" ");
		//l2.clear();
//		for(int i=0;i<l1.size();i++)
//			System.out.println(l2.get(i));   ----- error
		
		//System.out.println(l1.contains(32));
		//System.out.println(l1.lastIndexOf(9));
		//System.out.println(l2.isEmpty());
	}
}

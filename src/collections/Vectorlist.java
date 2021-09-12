package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Vectorlist {

	public static void main(String[] args) {
	
	//List<Integer> li = new LinkedList<Integer>();
		List<Integer> li = new Vector<Integer>();
	li.add(25);
	li.add(45);
	li.add(56);
	System.out.println(li);
	
	
	List<String> li1 = new LinkedList<String>();
	li1.add("saranya");
	li1.add("sairam");
	System.out.println(li1);
	
	List<Float> li2 = new LinkedList<Float>();
	li2.add(2.5F);
	li2.add(3.5F);
	System.out.println(li2);
	System.out.println(li2);
	
	//char
	
	List<Character> li3 = new LinkedList<Character>();
	li3.add('s');
	li3.add('e');
	li3.add('r');
	System.out.println(li3);
	
	
	//double
	
	List<Double> li4 = new LinkedList<Double>();
	li4.add(563.2D);
	li4.add(856.2D);
	System.out.println(li4);
	
	
	
	
	
	
	
	}
}

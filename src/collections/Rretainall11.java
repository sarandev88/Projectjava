package collections;

import java.util.ArrayList;
import java.util.List;

public class Rretainall11 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(4);
		li.add(2);
		
		List<Integer> li1 =  new ArrayList<Integer>();
		li1.add(5);
		li1.add(4);
		li1.add(1);
		System.out.println(li1);
		
		
		//Retainall
		
		li1.retainAll(li);
		System.out.println(li1);
		
		//remove all()
		
		li.remove(li1);
		System.out.println(li);
	}

}

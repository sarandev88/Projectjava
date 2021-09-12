package collections;

import java.util.ArrayList;
import java.util.List;

public class ARRAMethods {
	public static void main(String[] args) {
	
	List<Integer> li = new ArrayList<Integer>();
	li.add(12);
	li.add(45);
	li.add(25);
	li.add(55);
	
	//size() starts from 1
	
	int size = li.size();
	System.out.println("Size of the List:" +size);
	
	// get()---> index value starts from 0
	
	Integer integer = li.get(2);
	System.out.println(integer);
	
 	// contains() ---> 
	boolean contains = li.contains(55);
	System.out.println(contains);
	
	//remove----> removes entire thing
	li.remove(1);
	System.out.println(li);
	
	//get()
	
	Integer integer2 = li.get(2);
	System.out.println(integer2);
	
//add	
	li.add(200);
	System.out.println(li);
	
	//indexof()---->
	
	int indexOf = li.indexOf(5);
	System.out.println(indexOf);
	
	// set()---> replaces the value by index value
	
	li.set(2, 500);
	System.out.println(li);
	
	//addall()--->  
	List<Integer> li1 =  new ArrayList<Integer>();
	li1.add(12);
	li1.add(40);
	li1.add(25);
	
	//addall()
	
	li.addAll(li1);
	System.out.println(li);
	
	//retainall()
	
	li.retainAll(li1);
	System.out.println(li);
	
	
	
	
	
	
	
	
	
	

}
}

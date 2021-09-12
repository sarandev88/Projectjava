package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdemo {
	
	
	public static void main(String[] args) {
//		Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
//		//put -- used instead of add in map concept
//		
//		m.put(1, 1000);
//		m.put(2, 5000);
//		m.put(3, 6000);
//		m.put(4, 3000);
//		System.out.println(m);
		
//string concept with value duplicate values

//Map<Integer, String> m1 = new LinkedHashMap<Integer, String>();
//m1.put(1, "Sara");
//m1.put(2, "sedam");
//m1.put(3, "45");
//m1.put(4, "JAVA");
//m1.put(5, "JAVA");
//System.out.println(m1);

//string concept with key duplicate values (in key it overrides)

Map<Integer, String> m2 = new LinkedHashMap<Integer, String>();
m2.put(1, "Saran");
m2.put(2, "Bharani");
m2.put(3, "Sairam");
m2.put(3, "Gudeve");
m2.put(4, "Surya");
System.out.println(m2);

//size()
int size = m2.size();
System.out.println(size);

//get()
String string = m2.get(2);
System.out.println(string);

//values()  return type will be collection string because map is key and value concept but here we are passing only value so returntype is diff)
Collection<String> values = m2.values();
System.out.println(values);



//containskey()
boolean containsKey = m2.containsKey(6);
System.out.println(containsKey);

//containsvalue()
boolean containsValue = m2.containsValue("Surya");
System.out.println(containsValue);

//keySet()

Set<Integer> set = m2.keySet();
System.out.println(set);




//entryset()  prints all value separately

Set<Entry<Integer, String>> entrySet = m2.entrySet();
for (Entry<Integer, String> entry : entrySet) {
	System.out.println(entry);
	
}






		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}

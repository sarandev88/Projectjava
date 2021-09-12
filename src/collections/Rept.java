package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Rept {
	
	// more than one time is repetative word
	// "by the people for the people of the people"
	
	public static void main(String[] args) {
		
	
	
	String s ="by the people for the people of the people";
	String[] split = s.split(" ");
Map<String, Integer> m = new LinkedHashMap<String, Integer>();

for (String Kword : split) {
	if (m.containsKey(Kword)) {
		Integer integer = m.get(Kword);
		
		m.put(Kword, integer +1);
	} else {
		m.put(Kword, 1);
		}
}
	System.out.println(m);
	Set<Entry<String, Integer>> entry = m.entrySet();
	for (Entry<String, Integer> value : entry) {
		if (value.getValue()>1) {
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
	}
	}
}
	

	
	



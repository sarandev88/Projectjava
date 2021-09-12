package collections;

public class reversestring1prac {
	
	public static String reverse(String str) {
		
		//stringbuffer type
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		return sb.toString();

	}
	
	
	public static void main(String[] args) {
		reverse("JAVA");
		
	}

}

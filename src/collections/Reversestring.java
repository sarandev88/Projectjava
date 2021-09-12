package collections;

public class Reversestring {
	
	public static String reverse(String str) {
		
		//stringbuilder type
     StringBuilder sb = new StringBuilder(str);
     StringBuilder reverse = sb.reverse();
     System.out.println(reverse);
     
     return sb.toString();
     
     
	}
	
	
	public static void main(String[] args) {
		reverse("saranya");
		
	}

}

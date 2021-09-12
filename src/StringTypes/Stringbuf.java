package StringTypes;

public class Stringbuf {
	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer("Red");
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		//StringBuffer sb1 = new StringBuffer("Red");
		StringBuilder sb1 = new StringBuilder("Red");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		//concat we use append instead of +
		
		sb.append(sb1);
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
	}

}

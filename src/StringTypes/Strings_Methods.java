package StringTypes;

public class Strings_Methods {
	
	
	
	public static void main(String[] args) {
		String s = "Welcome to Java";
		System.out.println();
		//length starts from 1 its value based
		int length = s.length();
		System.out.println(length);
		
		
		//equals first --> checks text & second --> casing and space
		
		boolean equals = s.equals("Welcome To Java");
		System.out.println(equals);
		
		//equalsignore
		boolean equalsIgnoreCase = s.equalsIgnoreCase("WELCOME to Java");
		System.out.println(equalsIgnoreCase);

		//touppercase converts  all to upeprcase
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		
		//tolowercase converts to lowercase change everything to lowercase
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		//starts with (prefix) ---> word first prefix
		
		boolean startsWith = s.startsWith("Wel");
		System.out.println(startsWith);
		
		//endswith(suffix)
		
		boolean endsWith = s.endsWith("va");
		System.out.println(endsWith);
		
		//contains--> 
		boolean contains = s.contains("Welcome");
		System.out.println(contains);
		
		//Indexof (chooses  first one)
		
		int indexOf = s.indexOf("J");
		System.out.println(indexOf);
		
		
		//Lastindexof--->
		
		int lastIndexOf = s.lastIndexOf("o");
		System.out.println(lastIndexOf);
		
		//charat()-->  (index based) return type is char
		
		char charAt = s.charAt(4);
		System.out.println(charAt);
		
		//replace
		
		String replace = s.replace("to", "from");
		System.out.println(replace);
		
		
		//Substring(Beginning)
		
		String substring = s.substring(5);
		System.out.println(substring);
		
		//substring (beginning and end index)
		String substring2 = s.substring(3, 12);
		System.out.println(substring2);
		
		//trim--->> trim the spaces before and after quotes only not in between the words
		
		String trim = s.trim();
		System.out.println(trim);
		
		
		//isEmpty:
		
		
		String s1 = "Welcome to Java";
		String s2 = "456";
		String s3 ="4APPLE      PHONE";
		String s4= "                          ";
		String s5="";
		String s6 = null;
		boolean empty = s4.isEmpty();
		System.out.println(empty);
		
				
		
		
		
		
		
	}
	

}

package StringTypes;

public class Split {
	
	public static void main(String[] args) {
		String s = "Welcome to Java";
		System.out.println(s);
		//String[] split = s.split(" ");
		String[] split = s.split("o");
		for (String str : split) {
			//System.out.println("splitted");
			System.out.println(str);
			
		}
	}

}

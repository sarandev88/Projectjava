package Arrays;

public class Overridearray {
	public static void main(String[] args) {
		int a[]= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[2]=40; //it overrides and updates the new value only
		a[4]=50;
		System.out.println(a[2]);
		
	}
	

}




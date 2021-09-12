package programs;

public class GatherInterface implements A,B{

	@Override
	public void hungry() {
	System.out.println("SARANYA");	// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("SAIRAM");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		GatherInterface g = new GatherInterface();
		g.hungry();
		g.show();
	}

	
			}
	

	
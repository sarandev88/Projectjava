package programs;

public class Loan  extends Bank{
	public void personalLoan() {
		System.out.println("personal loan offer is 80%");
	}
	
	public static void main(String[] args) {
		Loan l = new Loan();
		l.goldLoan();
		l.personalLoan();
		l.homeLoan();
	}
	

}

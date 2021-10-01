
public class Main {
	public static void main(String[] args) {
		Payment p1= new Payment(103, "ppppp", "2021-07-02", 10.2);	
		ImplementacionPaymentMariaDB ip= new ImplementacionPaymentMariaDB();
		
		ip.createPayment(p1.getCustomerNumber(), p1.getCheckNumber(),p1.getPaymentDate(),p1.getAmount());
		
	}
}

import java.util.List;

public interface PaymentDAO {
	boolean createPayment(int ncliente,String checkNumber,String paymentDate,double amount);
	List<Payment> getpayments();
}

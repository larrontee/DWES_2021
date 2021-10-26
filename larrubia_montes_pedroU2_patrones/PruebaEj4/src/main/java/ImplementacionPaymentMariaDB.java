import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ImplementacionPaymentMariaDB implements PaymentDAO{
	public static void insertarcliente(int nc, String cN, String pD, double cantidad){
		
	}

	public boolean createPayment(int ncliente, String cNumber, String pDate, double at) {
		Connection con2 = ConexionBD.getConnection();
		String consulta1 = "select * from customers WHERE customerNumber = ?";
		try {
			con2.setAutoCommit(false);
			PreparedStatement ps = con2.prepareStatement(consulta1);
			ps.setInt(1, ncliente);
			ResultSet result = ps.executeQuery();
			int nrows = 0;
			while (result.next()) {
				nrows++;
			}
			if (nrows != 0) {
				String consulta2 = "INSERT INTO payments (customerNumber, checkNumber, paymentDate, amount)  VALUES (?,?,?,?);";
				PreparedStatement ps2 = con2.prepareStatement(consulta2);
				ps2.setInt(1,ncliente);
				ps2.setString(2,cNumber);
				ps2.setString(3,pDate);
				ps2.setDouble(4,at);
				ps2.execute();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hay un cliente con ese numero");
		return false;
	}

	public List<Payment> getpayments() {
		// TODO Auto-generated method stub
		return null;
	}

}

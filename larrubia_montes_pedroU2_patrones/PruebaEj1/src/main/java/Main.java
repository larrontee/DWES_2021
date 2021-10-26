
public class Main {
	public static void main(String[] args) {
		Pared p1= new Pared(1.2);
		Pared p2= new Pared(1.2);
		Pared p3= new Pared(1.2);
		Pared p4= new Pared(1.2);
		Tejado tejado1= new Tejado ();
		TejadoTejas tt= new TejadoTejas();
		
		tejado1.darSoporte();
		tt.darSoporte();
		
		Casa c1=new Casa(40,p1,p2,p3,p4,tejado1);
		Casa c2=new Casa(40,p1,p2,p3,p4,tt);
		
		System.out.println(c1);
		System.out.println(c2);
	}
}

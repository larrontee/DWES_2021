
public class Casa {
	private int area;
	private Pared p1;
	private Pared p2;
	private Pared p3;
	private Pared p4;
	private Tejado t;
	
	
	public Casa(int area, Pared pared1, Pared pared2, Pared pared3, Pared pared4, Tejado tejado) {
		super();
		this.area = area;
		this.p1 = pared1;
		this.p2 = pared2;
		this.p3 = pared3;
		this.p4 = pared4;
		this.t = tejado;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public Pared getP1() {
		return p1;
	}


	public void setP1(Pared p1) {
		this.p1 = p1;
	}


	public Pared getP2() {
		return p2;
	}


	public void setP2(Pared p2) {
		this.p2 = p2;
	}


	public Pared getP3() {
		return p3;
	}


	public void setP3(Pared p3) {
		this.p3 = p3;
	}


	public Pared getP4() {
		return p4;
	}


	public void setP4(Pared p4) {
		this.p4 = p4;
	}


	public Tejado getT() {
		return t;
	}


	public void setT(Tejado t) {
		this.t = t;
	}


	@Override
	public String toString() {
		return "Casa [area=" + area + ", p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + ", t=" + t + "]";
	}
	
	
	
	
}

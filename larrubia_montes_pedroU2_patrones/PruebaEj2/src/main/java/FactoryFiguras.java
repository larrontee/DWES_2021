
public class FactoryFiguras {
	public static Figura getFigura(String name,String tono) {
		if (name.equals("Circulo")) {
			return new Circulo(tono);
		} else if (name.equals("Cuadrado")) {
			return new Cuadrado(tono);
		} else if (name.equals("Rectangulo")) {
			return new Rectangulo(tono);
		} else {
			return new Triangulo(tono);
		}
		
	}
}

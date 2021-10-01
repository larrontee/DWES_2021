
public class Main {
	public static void main(String[] args) {
		
		Figura f1 = FactoryFiguras.getFigura("Circulo", "Azul");
		Figura f2 = FactoryFiguras.getFigura("Cuadrado", "Naranja");
		Figura f3 = FactoryFiguras.getFigura("Rectangulo", "Verde");
		Figura f4 = FactoryFiguras.getFigura("Triángulo", "Amarillo");

		f1.dibujarFigura();
		f2.dibujarFigura();
		f3.dibujarFigura();
		f4.dibujarFigura();
	}
}

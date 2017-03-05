package paquete;

public class PruebaRetorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r = new Rectangulo(3.0,7.0);
		System.out.println(" El area es " +r.calcularArea());
	}

}

class Rectangulo{
	private double base, altura;
	public Rectangulo(double b, double h){
		base = b;
		altura = h;
	}
	
	public double calcularArea(){
		return base*altura;
	}
}
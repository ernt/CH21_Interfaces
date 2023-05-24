
public class Cuadrado implements Figuras {
	private String name;
	private double lado;
	
	
	

	public Cuadrado(String name, double lado) {
		this.name = name;
		this.lado = lado;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double calcularArea() {
		return Math.round(Math.pow(getLado(), 2));
	}

	@Override
	public double calcularPerimetro() {
		return Math.round(getLado()*4);
	}



	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}
	
	

}

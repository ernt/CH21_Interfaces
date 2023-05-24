
public class Trapecio implements Figuras {
	
	private String name;
	private double lado;
	private double basemax;
	private double basemin;
	private double altura;
	
	

	public Trapecio(String name, double lado, double basemax, double basemin, double altura) {
		
		this.name = name;
		this.lado = lado;
		this.basemax = basemax;
		this.basemin = basemin;
		this.altura = altura;
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



	public double getBasemax() {
		return basemax;
	}



	public void setBasemax(double basemax) {
		this.basemax = basemax;
	}



	public double getBasemin() {
		return basemin;
	}



	public void setBasemin(double basemin) {
		this.basemin = basemin;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", lado=" + lado + ", basemax=" + basemax + ", basemin=" + basemin
				+ ", altura=" + altura + "]";
	}



	@Override
	public double calcularArea() {
		return Math.round(((getAltura()*(getBasemin()+getBasemax()))/2));
	}

	@Override
	public double calcularPerimetro() {
		return Math.round((getLado()*4));
		
	}

	
		
	
	
	
	
}

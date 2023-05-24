
public class Romboide implements Figuras {
	private double base;
	private double altura;
	private String name;
	
	
	
	
	

	public Romboide(double base, double altura, String name) {
		
		this.base = base;
		this.altura = altura;
		this.name = name;
	}
	
	

	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Romboide [base=" + base + ", altura=" + altura + ", name=" + name + "]";
	}



	@Override
	public double calcularArea() {
		 Rectangulo tmp = new Rectangulo(getName(),getBase(),getAltura() );
		return tmp.calcularArea();
	}

	@Override
	public double calcularPerimetro() {
		 Rectangulo tmp = new Rectangulo(getName(),getBase(),getAltura() );
			return tmp.calcularPerimetro();
	}

	

}

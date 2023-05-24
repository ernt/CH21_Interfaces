
public class Rombo implements Figuras {
	private String name ;
	private double diagonalmin; 
	private double diagonalmax ; 
	private double lado ;
	
	
	

	

	
	




	public Rombo(String name, double diagonalmin, double diagonalmax, double lado) {
		
		this.name = name;
		this.diagonalmin = diagonalmin;
		this.diagonalmax = diagonalmax;
		this.lado = lado;
	}





	public double getLado() {
		return lado;
	}





	public void setLado(double lado) {
		this.lado = lado;
	}





	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getDiagonalmin() {
		return diagonalmin;
	}



	public void setDiagonalmin(double diagonalmin) {
		this.diagonalmin = diagonalmin;
	}



	public double getDiagonalmax() {
		return diagonalmax;
	}



	public void setDiagonalmax(double diagonalmax) {
		this.diagonalmax = diagonalmax;
	}

	


	@Override
	public String toString() {
		return "Rombo [name=" + name + ", diagonalmin=" + diagonalmin + ", diagonalmax=" + diagonalmax + "]";
	}



	@Override
	public double calcularArea() {
		return Math.round((getDiagonalmax()*getDiagonalmin())/2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return Math.round(getLado()*4);
	}

	

}

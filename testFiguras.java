public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas
		imprimirCalculo(t1); imprimirCalculo(t2);
		
		Cuadrado c1 = new Cuadrado("Cuadrado", 20.2);
		Cuadrado c2 = new Cuadrado ("Cuadradito", 10.1);
		imprimirCalculo(c1); imprimirCalculo(c2);
		Rectangulo r1 = new Rectangulo("Rectangulo",10.2, 21.2);
		Rectangulo r2 = new Rectangulo("Rectangulito",2.2, 10.2);
		imprimirCalculo(r1); imprimirCalculo(r2);
		Rombo ro1 = new Rombo("Rombo",10.1,20.1,5.2);
		Rombo ro2 = new Rombo("Rombito",5.1,10.1,2.2);
		imprimirCalculo(ro1); imprimirCalculo(ro2);
		Romboide rom1 = new Romboide(20.2, 40.4,"Romboide");
		Romboide rom2 = new Romboide(10.2, 20.4,"Romboidecito");
		imprimirCalculo(rom1); imprimirCalculo(rom2);
		Trapecio ta1= new Trapecio("Trapecio", 22.2,21.2,10.2,23.2);
		Trapecio ta2= new Trapecio("Trapeciochiquito", 12.2,11.2,5.2,13.2);
		imprimirCalculo(ta1); imprimirCalculo(ta2);
		
	}//main
	
	public static void imprimirCalculo(Figuras r ) {
		System.out.println(r);
		System.out.println("+========================================");
		System.out.println("|El área de ["+r.getName()+"] es: " + r.calcularArea() + 
				"\n" + "|El perímetro de ["+r.getName()+"] es: " + r.calcularPerimetro());
		System.out.println("+========================================");
	}
	
//imprimirCalculo
}//class testFiguras
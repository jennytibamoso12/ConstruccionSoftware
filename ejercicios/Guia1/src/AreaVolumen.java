import java.util.Scanner;

public class AreaVolumen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float r;
		double area;
		double volumen;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ejercicio de Area y Volumen ");
		System.out.println("Ingrese el valor del radio");
		r = entrada.nextFloat();
				
		entrada.close();
		
		area = Math.PI * Math.pow(r, 2);
		volumen = (4/3) * (Math.PI * Math.pow(r, 3));
		
		System.out.println(" El area de un circulo de radio " + r + " es: " + area);
		System.out.println(" El volumen de una circunferencia de radio " + r + " es: " + volumen);
	}

}

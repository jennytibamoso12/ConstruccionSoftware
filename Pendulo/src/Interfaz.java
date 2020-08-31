import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {

		
		int longitud;
		int aceleracion;
		Pendulo pendulo;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Calculo de periodo de un pendulo");
		System.out.println("Ingrese el valor de la longitud");
		longitud = entrada.nextInt();
		System.out.println("Ingrese el valor de la aceleracion");
		aceleracion = entrada.nextInt();
		pendulo = new Pendulo(longitud, aceleracion);
		
		
		System.out.println("El valor del periodo es :" + pendulo.calcularPeriodo());
		
		entrada.close();

	}

	
}

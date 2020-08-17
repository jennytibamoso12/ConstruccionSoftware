import java.util.Scanner;

public class Colectivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float turistas;
		float cantidadPasajeros;
		double viajes;
		double pagarPasajeros;
		double pagarConductor;
			
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ejercicio el colectivo");
		System.out.println("Ingrese la cantidad de pasajeros que caben en el colectivo ");
		cantidadPasajeros = entrada.nextInt();
		System.out.println("Ingrese la cantidad de turistas que van al hotel ");
		turistas = entrada.nextInt();
						
		entrada.close();
		
		viajes = Math.ceil((turistas / cantidadPasajeros) );
		pagarPasajeros = 10000 * viajes;
		pagarConductor = 2000 * viajes;
			
		System.out.println(" El numero de viajes que realiza el colectivo son: " + viajes );
		System.out.println(" El total a pagar de los turistas es: " + pagarPasajeros );
		System.out.println(" El total a pagar del conductor al propietario es: " + pagarConductor );

	}

}
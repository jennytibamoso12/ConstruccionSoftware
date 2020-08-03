import java.util.Scanner;

public class DistanciaDosPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float latitud1;
		float longitud1;
		float latitud2;
		float longitud2;
		double distancia;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ejercicio Distancia entre dos puntos ");
		System.out.println("Ingrese la latitud de la primera ciudad");
		latitud1 = entrada.nextFloat();
		System.out.println("Ingrese la longitud de la primera ciudad");
		longitud1 = entrada.nextFloat();
		System.out.println("Ingrese la latitud de la segunda ciudad");
		latitud2 = entrada.nextFloat();
		System.out.println("Ingrese la longitud de la segunda ciudad");
		longitud2 = entrada.nextFloat();
		
		entrada.close();
		
		
		
		distancia =6371.07*(Math.acos(Math.sin(Math.toRadians(latitud1)))* Math.sin(Math.toRadians(latitud2))+ Math.cos(Math.toRadians(latitud1))* Math.cos(Math.toRadians(latitud2))*(Math.cos(Math.toRadians(longitud1 - longitud2))));
		System.out.println("La distancia entre dos puntos en la tierra es: " + distancia);
	}

}

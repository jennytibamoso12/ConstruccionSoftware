import java.util.Scanner;

public class Paseo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float gordos;
		float flacos;
		double dias;
		double buses;
		double platosServir;
		double costoPlatos;
		double habitaciones;
		double costoHabitacion;
		double costoHabitacionTotal;
		
			
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ejercicio dl paseo");
		System.out.println("Ingrese la cantidad de personas gordas");
		gordos = entrada.nextInt();
		System.out.println("Ingrese la cantidad de personas flacas ");
		flacos = entrada.nextInt();
		System.out.println("Ingrese la cantidad de dias que dura el paseo ");
		dias = entrada.nextInt();
						
		entrada.close();
		
		buses = Math.ceil(((gordos * 2 )+  flacos)/60);
		platosServir = (gordos * 5 )+  (flacos * 3);
		costoPlatos = platosServir * 10000 * dias;
		habitaciones = Math.ceil((gordos + flacos )/4);
		costoHabitacion = habitaciones * 25000;
		costoHabitacionTotal = costoHabitacion * dias;
				
				
		System.out.println(" El numero buses que se necesitan son: " + buses );
		System.out.println(" El nuero de platos que hay que servir por dia son: " + platosServir );
		System.out.println(" El costo total de los platos servidos en total del paseo son: " + costoPlatos );
		System.out.println(" El numero de habitaciones que se necesitan son: " + habitaciones );
		System.out.println(" El costo de las habitaciones por dia es: " + costoHabitacion );
		System.out.println(" El costo de las habitaciones por todo el paseo es: " + costoHabitacionTotal );

	}

}

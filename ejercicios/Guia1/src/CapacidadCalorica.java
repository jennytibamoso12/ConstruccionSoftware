import java.util.Scanner;

public class CapacidadCalorica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float masa;
		int temperatura;
		float q;
			
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ejercicio de capacidad calorica ");
		System.out.println("Ingrese la masa del agua");
		masa = entrada.nextFloat();
		System.out.println("Ingrese la temperatura a aumentar");
		temperatura = entrada.nextInt();
				
		entrada.close();
		
		q = masa * temperatura;
				
		System.out.println(" La cantidad de energia para alcanzar la temperatura deseada del agua es: " + q );

	}

}

import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {
		int opcion = 0;
		int numeroSotanos;
		int numeroPisos;
		Ascensor ascensor = null;

		Scanner entrada = new Scanner(System.in);

		while (opcion != 6) {

			System.out.println("\nElige la opcion:");
			System.out.println("Crear Nuevo Ascensor: 1");
			System.out.println("Calcular piso siguiente: 2");
			System.out.println("Calcular piso anterior: 3");
			System.out.println("Calcular pisos que puede atender el ascensor: 4");
			System.out.println("Mostar piso actual: 5");
			System.out.println("Salir del Programa: 6");

			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Ingrese los datos del ascensor: ");
				System.out.println("Ingrese el número de pisos");
				numeroPisos = entrada.nextInt();
				System.out.println("Ingrese el número de sotanos");
				numeroSotanos = entrada.nextInt();

				ascensor = new Ascensor(numeroPisos, numeroSotanos, 1);

				break;
			case 2:

				if (ascensor == null) {
					System.out.println("No existe ascensor creado digite la opción 1");
				} else {
					System.out.println("El piso siguiente es: " + ascensor.calcularPisoSiguiente());
				}

				break;
			case 3:
				if (ascensor == null) {
					System.out.println("No existe ascensor creado digite la opción 1");
				} else {
					System.out.println("El piso anterio es: " + ascensor.calcularPisoAnterior());
				}

				break;
			case 4:
				if (ascensor == null) {
					System.out.println("No existe ascensor creado digite la opción 1");
				} else {
					System.out.println(
							"El número de pisos que el ascensor puede atender es: " + ascensor.calcularPisosAtender());
				}

				break;
			case 5:
				if (ascensor == null) {
					System.out.println("No existe ascensor creado digite la opción 1");
				} else {
					System.out.println("El piso actual del ascensor es: " + ascensor.getPisoActual());
				}

				break;
			case 6:
				System.out.println("Gracias");
				break;

			}

		}
		entrada.close();

	}
}

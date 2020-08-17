import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 1;
		List<Integer> arreglo = new ArrayList<>();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Algoritmo para leer números enteros");

		while (numero != 0) {
			System.out.println("Ingrese el numero");
			numero = entrada.nextInt();
			if (numero != 0) {
				arreglo.add(numero);
			}
		}

		entrada.close();

		for (int i = 0; i < arreglo.size(); i++) {

			if (arreglo.get(i) < 0) {
				System.out.println("El cuadrado de " + arreglo.get(i) + " es " + Math.pow(arreglo.get(i), 2));
			} else
				System.out.println("El cubo de " + arreglo.get(i) + " es " + Math.pow(arreglo.get(i), 3));

		}

	}
}

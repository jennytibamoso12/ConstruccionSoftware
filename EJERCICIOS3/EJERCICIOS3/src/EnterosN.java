import java.util.Arrays;
import java.util.Scanner;

public class EnterosN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		double promedio = 0;
		

		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese la cantidad de numeros a leer");
		numero = entrada.nextInt();

		int arreglo[] = new int[numero];
		
		
		for (int i = 0; i < numero; i++) {

			System.out.println("Digite el número " + (i + 1));
			arreglo[i] = entrada.nextInt();
			promedio = promedio + arreglo[i];

		}
		
		entrada.close();
		
		Arrays.sort(arreglo);
		
		System.out.println("El número menor es: " + arreglo[0]);
		System.out.println("El número mayor es: " + arreglo[numero - 1]);
		System.out.println("El promedio de los números es: " + (promedio/numero));

	}

}

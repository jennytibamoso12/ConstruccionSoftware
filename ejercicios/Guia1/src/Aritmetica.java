import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {

		int valorA;
		int valorB;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ejercicio de Aritmética");
		System.out.println("Ingrese el valor A");
		valorA = entrada.nextInt();
		System.out.println("Ingrese el valor B");
		valorB = entrada.nextInt();

		entrada.close();
		System.out.println("La suma de  A y B es: "+ (valorA + valorB));
		System.out.println("La resta de B menos A es: "+ (valorB - valorA));
		System.out.println("El producto de A y B es: "+ (valorA * valorB));
		System.out.println("El cociente cuando A es dividio entre B es: "+ (valorA / valorB));
		System.out.println("El residuo de la division entre A y B es: "+ (valorA % valorB));
		System.out.println("El resultado de encontrar el logaritmo de A es: "+ (Math.log(valorA)));
		System.out.println("El resultado de hallar A^B es: "+ (Math.pow(valorA,valorB)));
	}
}

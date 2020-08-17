import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1;
		int numero2;
		int contadorDivisores;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Proyecto de numeros primos en un rango dado");
		System.out.println("digite un numero desde que numero   ");
		numero1 = entrada.nextInt();
		System.out.println("digite hasta que numero desea ");
		numero2 = entrada.nextInt();
		entrada.close();

		System.out.println("Los numeros primos en el rango digitado son:");

		for (; numero1 <= numero2; numero1++) {

			contadorDivisores = 0;
			
			for (int i = 1; i <= numero1; i++) {

				if (numero1 % i == 0) {
					contadorDivisores++;
				}

			}
			if (contadorDivisores == 2) {
				System.out.print(numero1 + "\t");
			}

		}

	}

}

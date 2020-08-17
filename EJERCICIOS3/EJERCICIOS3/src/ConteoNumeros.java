import java.util.Scanner;

public class ConteoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros;
		int cantidadPares = 0;
		int sumaPares = 0;
		int cantidadImpares= 0;
		int sumaImpares= 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese la cantidad de numeros a ingresar" );
		numeros = entrada.nextInt();	
		int totalNumeros[] = new int[numeros];
		
		for (int i = 0; i < numeros; i++) {

			System.out.println("Digite el número " + (i + 1));
			totalNumeros[i] = entrada.nextInt();			
		}
		entrada.close();
		
		for (int i = 0; i < numeros; i++) {
			if (totalNumeros[i] % 2 == 0) {
				cantidadPares++;
				sumaPares= totalNumeros[i] + sumaPares ;				
			}else {
				cantidadImpares++;
				sumaImpares= totalNumeros[i] + sumaImpares ;
			}
		}
		System.out.println("la cantidad de numeros pares digitados son: " + cantidadPares + " y la suma total es " + sumaPares );
		System.out.println("la cantidad de numeros Impares digitados son: " + cantidadImpares + " y la suma total es " + sumaImpares );
	}

}

import java.util.Scanner;

public class PoligonoRegular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lados;
		float longitud;
		double resultado;
			
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ejercicio de Area de un poligono regular ");
		System.out.println("Ingrese el numero de lados ");
		lados = entrada.nextInt();
		System.out.println("Ingrese la longitud de los lados ");
		longitud = entrada.nextInt();
				
		entrada.close();
		
		resultado = (lados * Math.pow(longitud, 2))/(4 * Math.tan(Math.PI/lados));
						
		System.out.println(" El area del poligono regular es " + resultado );


	}

}

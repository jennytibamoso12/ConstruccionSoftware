import java.util.Scanner;

public class EficienciaCombustible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valorMPG;		

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ejercicio de Eficiencia de Combustible");
		System.out.println("Ingrese el valor de millas por galón MPG: ");
		valorMPG = entrada.nextFloat();
		entrada.close();
		
		System.out.println(valorMPG + " MPG son: " + (0.425144 * valorMPG)+ " LPK");

	}

}

import java.util.Scanner;

public class ConversorUnidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String unidadMedida;
		double valorMedida;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ejercicio de Conversor de Medidas");
		System.out.println("Ingrese la Unidad de Medida");
		unidadMedida = entrada.next();
		System.out.println("Ingrese el valor de la Medida ");
		valorMedida = entrada.nextDouble();
		entrada.close();
		
		if (unidadMedida.equalsIgnoreCase("P")) {
			System.out.println("La conversion de " + valorMedida + "pies a pulgadas es : "+ (valorMedida / 0.0833));
		}else if (unidadMedida.equalsIgnoreCase("C")) {
			System.out.println("La conversion de " + valorMedida + "centimetros a pulgadas es : "+ (valorMedida / 2.54));
		}else if (unidadMedida.equalsIgnoreCase("L")) {
			System.out.println("La conversion de " + valorMedida + "leguas a pulgadas es : "+ (valorMedida * 190080.02));
		}else if (unidadMedida.equalsIgnoreCase("Y")) {
			System.out.println("La conversion de " + valorMedida + "yardas a pulgadas es : "+ (valorMedida * 36));
		} else 
			System.out.println("La unidad de medida no es valida "); 
			

	}

}

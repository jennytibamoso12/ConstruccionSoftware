import java.util.Scanner;

public class CirculoRadior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radio;
		double areaCirculo;
		double hipotenusa;
		double areaCuadrado;
			
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el radio del circulo");
		System.out.println("El radio del circulo es: ");
		radio = entrada.nextInt();						
		entrada.close();
		
		areaCirculo = (Math.PI * Math.pow(radio, 2));
		hipotenusa = Math.sqrt((Math.pow(radio, 2) + Math.pow(radio, 2)));
		
		areaCuadrado = Math.pow(hipotenusa, 2);
		
		
		System.out.println("El area del circulo de radio " + radio + " es igual a: " + areaCirculo);
		System.out.println("El area del cuadrado de lados " + hipotenusa + " es igual a: " + areaCuadrado);
		System.out.println("El area sombreada entre el circulo y el cuadradado es de: " + (areaCirculo - areaCuadrado));

	}

}

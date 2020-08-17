import java.util.Scanner;

public class CompaniaSeguros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empleados;
				
		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese la cantidad de empleados" );
		empleados = entrada.nextInt();	
		int sueldoBasico[] = new int[empleados];
		int ventas[] = new int[empleados];
		
		
		for (int i = 0; i < empleados; i++) {

			System.out.println("Digite salario base del empleado " + (i + 1));
			sueldoBasico[i] = entrada.nextInt();
			System.out.println("Digite el numero de ventas realizadas del empleado " + (i + 1));
			ventas[i] = entrada.nextInt();		

		}
		entrada.close();
		for (int i = 0; i < empleados; i++) {

			System.out.println("Empleado  " + (i + 1) + "\nTotal a pagar: " + (sueldoBasico[i] + (ventas[i]*0.1)) );
			System.out.println("Sueldo base: " + sueldoBasico[i]);
			System.out.println("Comisiones: " + (ventas[i]*0.1));
		}
		
		}
}

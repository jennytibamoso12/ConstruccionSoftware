import java.util.Scanner;

public class TroncoCono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float radio1;
		float altura1;
		float radio2;
		float altura2;
		double volumen;
		
		double volumen1;
		double volumen2;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ejercicio Tronco de Cono");
		System.out.println("Ingrese el radio del cono 1");
		radio1 = entrada.nextInt();
		System.out.println("Ingrese la altura del cono 1 ");
		altura1 = entrada.nextInt();
		System.out.println("Ingrese el radio del cono 2 ");
		radio2 = entrada.nextInt();
		System.out.println("Ingrese el altura del cono 2 ");
		altura2 = entrada.nextInt();
						
		entrada.close();
		//opcion 1
		volumen = (((altura1 - altura2) * Math.PI)/3)* (Math.pow(radio1, 2)+ (Math.pow(radio2, 2)+ (radio1 * radio2)));
		//opcion 2
		volumen1 = ((Math.PI * Math.pow(radio1, 2)) * altura1) /3 ;
		volumen2 = ((Math.PI * Math.pow(radio2, 2)) * altura2)/3;
				
		System.out.println(" El volumen del tronco cono es: " + volumen );
		System.out.println(" El volumen del tronco cono es: " + (volumen1-volumen2) );
		
		
	}

}

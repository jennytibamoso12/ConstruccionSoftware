import java.util.Scanner;

public class ImpuestoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float precioBruto;
		String tipoVehiculo;
	
			
		Scanner entrada = new Scanner(System.in);

		System.out.println("Impuesto a pagar por el vehiculo");
		System.out.println("Ingrese el precio bruto del vehiculo ");
		precioBruto = entrada.nextFloat();
		System.out.println("Ingrese el tipo de vehiculo C para camioneta y A para automovil ");
		tipoVehiculo = entrada.next();
						
		entrada.close();
		if (tipoVehiculo.equalsIgnoreCase("C") && precioBruto < 80 ) {
			System.out.println("El impuesto a pagar para este vehiculo es cero");			
		}else if  (tipoVehiculo.equalsIgnoreCase("C") && precioBruto >= 80 ) {
			System.out.println("El impuesto a pagar para este vehiculo es: "+ precioBruto/2);
		}else if  (tipoVehiculo.equalsIgnoreCase("A") && precioBruto <  20 ) {
			System.out.println("El impuesto a pagar para este vehiculo es de 5 pesos" );
		}else if  (tipoVehiculo.equalsIgnoreCase("A") && precioBruto >=  20 && precioBruto <= 40 ) {
			System.out.println("El impuesto a pagar para este vehiculo es: "+ precioBruto/5);
		}else if  (tipoVehiculo.equalsIgnoreCase("A") && precioBruto >  40 ) {
			System.out.println("El impuesto a pagar para este vehiculo es de 9 pesos" );
		} else
			System.out.println("El tipo de vehiculo no es valido" );
	}

}

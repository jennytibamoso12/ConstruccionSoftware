import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tipoComida;
		int platoSeleccionado;
		int cantidad;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Restaurante");
		System.out.println(
				"Seleccione el tipo de comida \nV \tpara Vegetariana \nNV \tpara No vegetariana \nCR \tpara comidas Rapidas");
		tipoComida = entrada.next();
		if (tipoComida.equalsIgnoreCase("V")) {
			System.out.println("Seleccione el plato: \n1. Sopa de vegetales \n2. Ensaladas \n3. Jugos");
			platoSeleccionado = entrada.nextInt();
			System.out.println("Ingrese la cantidas de platos");
			cantidad = entrada.nextInt();
			if (platoSeleccionado == 1) {
				System.out.println("El valor unitario de la sopa de vegetales es $10.000");
				System.out.println(
						"Su pedido de " + cantidad + " platos tiene un valor de: \nValor Antes de IVA:\t" + (10000 * cantidad) + "\n+IVA:\t\t\t"
								+ ((10000 * cantidad) * 0.19) + "\n-Descuento:\t\t" + (((10000 * cantidad) * 1.19) * 0.2)
								+ "\nTotal a Pagar:\t\t" + (((10000 * cantidad) * 1.19) * 0.8));
			} else if (platoSeleccionado == 2) {
				System.out.println("El valor unitario de la ensalada es $25.000");
				System.out.println("Su pedido " + cantidad + " platos tiene un valor de: \nValor Antes de IVA:\t" + (25000 * cantidad) + "\n+IVA:\t\t\t"
						+ ((25000 * cantidad) * 0.19) + "\n-Descuento:\t\t" + (((25000 * cantidad) * 1.19) * 0.2)
						+ "\nTotal a Pagar:\t\t" + (((25000 * cantidad) * 1.19) * 0.8));
			} else if (platoSeleccionado == 3) {
				System.out.println("El valor unitario del jugo es $5.000");
				System.out.println("Su pedido " + cantidad + " platos tiene un valor de: \nValor Antes de IVA:\t" + (5000 * cantidad) + "\n+IVA:\t\t\t"
						+ ((5000 * cantidad) * 0.19) + "\n-Descuento:\t\t" + (((5000 * cantidad) * 1.19) * 0.2)
						+ "\nTotal a Pagar:\t\t" + (((5000 * cantidad) * 1.19) * 0.8));
			} else
				System.out.println("Plato seleccionado no valido");
		} else if (tipoComida.equalsIgnoreCase("NV")) {
			System.out.println("Seleccione el plato: \n1. Bandeja de carne \n2. Bandeja de pollo");
			platoSeleccionado = entrada.nextInt();
			System.out.println("Ingrese la cantidas de platos");
			cantidad = entrada.nextInt();
			if (platoSeleccionado == 1) {
				System.out.println("El valor unitario de la Bandeja de Carne es $30.000");
				System.out.println("Su pedido " + cantidad + " platos tiene un valor de: \nValor Antes de IVA:\t" + (30000 * cantidad) + "\n+IVA:\t\t\t"
						+ ((30000 * cantidad) * 0.19) + "\n-Descuento:\t\t" + (((30000 * cantidad) * 1.19) * 0.1)
						+ "\nTotal a Pagar:\t\t" + (((30000 * cantidad) * 1.19) * 0.9));
			} else if (platoSeleccionado == 2) {
				System.out.println("El valor unitario de la Bandeja de Pollo es $28.000");
				System.out.println("Su pedido " + cantidad + " platos tiene un valor de: \nValor Antes de IVA:\t" + (28000 * cantidad) + "\n+IVA:\t\t\t"
						+ ((28000 * cantidad) * 0.19) + "\n-Descuento:\t\t" + (((28000 * cantidad) * 1.19) * 0.1)
						+ "\nTotal a Pagar:\t\t" + (((28000 * cantidad) * 1.19) * 0.9));
			} else
				System.out.println("Plato seleccionado no valido");

		} else if (tipoComida.equalsIgnoreCase("CR")) {
			System.out.println("Seleccione el plato: \n1. Perro caliente \n2. Hambuerguesa");

			platoSeleccionado = entrada.nextInt();
			System.out.println("Ingrese la cantidas de platos");
			cantidad = entrada.nextInt();
			if (platoSeleccionado == 1) {
				System.out.println("El valor unitario del Perro caliente es $5.000");
				System.out.println("Su pedido " + cantidad + " platos tiene un valor de: \nValor Antes de IVA:\t" + (5000 * cantidad) + "\n+IVA:\t\t\t"
						+ ((5000 * cantidad) * 0.19) + "\nTotal a Pagar:\t\t" + ((5000 * cantidad) * 1.19));
			} else if (platoSeleccionado == 2) {
				System.out.println("El valor unitario de la Hamburguesa es $7.000");
				System.out.println("Su pedido " + cantidad + " platos tiene un valor de: \nValor Antes de IVA:\t" + (7000 * cantidad) + "\n+IVA:\t\t\t"
						+ ((7000 * cantidad) * 0.19) + "\nTotal a Pagar:\t\t" + ((7000 * cantidad) * 1.19));
			} else
				System.out.println("Plato seleccionado no valido");

		} else
			System.out.println("El tipo de comida ingresado no es valido");

		entrada.close();
	}

}

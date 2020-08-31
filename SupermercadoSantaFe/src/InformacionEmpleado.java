import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InformacionEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;
		List<Empleado> listaEmpleados = new ArrayList<>();
		Empleado empleado;
		int cedulaBuscar;
		int datosEncontrados;
		String departamento;
		double salario;
		String posicion;

		Scanner entrada = new Scanner(System.in);

		

		while (opcion != 5) {

			System.out.println("\nElige la opcion:");
			System.out.println("Agregar Empleado a la lista: 1");
			System.out.println("Mostrar los datos de un empleado: 2");
			System.out.println("Sumar los salarios de los empleados de un departamento: 3");
			System.out.println("Contar la cantidad de empleados que ocupan una posición: 4");
			System.out.println("Salir del Programa: 5");
			
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:

				empleado = new Empleado();

				System.out.println("Ingrese los datos del empleado: ");
				System.out.println("Ingrese el número de cedula");
				empleado.setCedula(entrada.nextInt());
				System.out.println("Ingrese el nombre");
				empleado.setNombre(entrada.next());
				System.out.println("Ingrese el departamento");
				empleado.setDepartamento(entrada.next());
				System.out.println("Ingrese la posición");
				empleado.setPosicion(entrada.next());
				System.out.println("Ingrese el salario");
				empleado.setSalario(entrada.nextDouble());

				listaEmpleados.add(empleado);

				break;
			case 2:

				System.out.println("Ingrese el número de cedula del empleado a buscar");
				cedulaBuscar = entrada.nextInt();
				datosEncontrados = 0;

				for (Empleado empleadoBuscar : listaEmpleados) {

					if (empleadoBuscar.getCedula() == cedulaBuscar) {
						datosEncontrados++;
						System.out.println("Los datos del empleado son:");
						System.out.println("Cedula :" + empleadoBuscar.getCedula());
						System.out.println("Nombre: " + empleadoBuscar.getNombre());
						System.out.println("Departamento: " + empleadoBuscar.getDepartamento());
						System.out.println("Posición: " + empleadoBuscar.getPosicion());
						System.out.println("Salario: " + empleadoBuscar.getSalario());
					}

					
				}
				
				if (datosEncontrados == 0) {
					System.out.println("No se encontro ningún dato");
				}

				break;

			case 3:
				System.out.println("Ingrese el número de departamento");
				departamento = entrada.next();
				salario = 0;

				for (Empleado empleadoBuscar : listaEmpleados) {

					if (empleadoBuscar.getDepartamento().equalsIgnoreCase(departamento)) {
						salario = salario + empleadoBuscar.getSalario();

					}

				}

				System.out.println("La suma de todos los salarios de los empleados del departamento " + departamento
						+ " es: " + salario);

				break;
			case 4:
				System.out.println("Ingrese la posición del empleado");
				posicion = entrada.next();
				datosEncontrados = 0;

				for (Empleado empleadoBuscar : listaEmpleados) {

					if (empleadoBuscar.getPosicion().equalsIgnoreCase(posicion)) {
						datosEncontrados++;

					}

				}

				System.out.println(
						"La cantidad de empleados que ocupan la posición " + posicion + " son: " + datosEncontrados);

				break;

			case 5:
				System.out.println("Gracias");

				break;

			default:
				System.out.println("La opción digitada es incorrecta");

			}
		}

		entrada.close();
	}

}

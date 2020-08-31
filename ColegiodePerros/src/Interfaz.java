import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {

		int opcion = 0;
		List<Perro> listaPerros = new ArrayList<>();
		Perro perro;
		int codigoPerroBuscar;
		int cedulaDuenoBuscar;
		int datosEncontrados;
		String razaPerroBuscar;
		String localidadPerroBuscar;
		int indicePerro;

		Scanner entrada = new Scanner(System.in);

		while (opcion != 7) {

			System.out.println("\nElige la opcion:");
			System.out.println("Agregar Perro a la lista: 1");
			System.out.println("Obtener información del Perro: 2");
			System.out.println("Eliminar datos del Perro: 3");
			System.out.println("Consultar perros de un dueño: 4");
			System.out.println("Consultar cantidad de perros de una raza: 5");
			System.out.println("Consultar cantidad de perros en una localidad: 6");
			System.out.println("Salir del Programa: 7");

			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:

				perro = new Perro();

				System.out.println("Ingrese los datos del Perro: ");
				System.out.println("Ingrese el código del Perro");
				perro.setCodigoPerro(entrada.nextInt());
				System.out.println("Ingrese el nombre");
				perro.setNombre(entrada.next());
				System.out.println("Ingrese la raza");
				perro.setRaza(entrada.next());
				System.out.println("Ingrese la localidad");
				perro.setLocalidad(entrada.next());
				System.out.println("Ingrese el cedula del Dueño");
				perro.setCedulaDueno(entrada.nextInt());
				System.out.println("Ingrese el nombre del Dueño");
				perro.setNombreDueno(entrada.next());

				listaPerros.add(perro);

				break;
			case 2:

				System.out.println("Ingrese el código del Perro a buscar");
				codigoPerroBuscar = entrada.nextInt();
				datosEncontrados = 0;

				for (Perro perroBuscar : listaPerros) {

					if (perroBuscar.getCodigoPerro() == codigoPerroBuscar) {
						datosEncontrados++;
						System.out.println("Los datos del Perro son:");
						System.out.println("Codigo:\t" + perroBuscar.getCodigoPerro());
						System.out.println("Nombre:\t" + perroBuscar.getNombre());
						System.out.println("Raza:\t" + perroBuscar.getRaza());
						System.out.println("Localidad:\t" + perroBuscar.getLocalidad());
						System.out.println("Cedula Dueño:\t" + perroBuscar.getCedulaDueno());
						System.out.println("Nombre Dueño:\t" + perroBuscar.getNombreDueno());
					}

				}

				if (datosEncontrados == 0) {
					System.out.println("No se encontro ningún dato");
				}

				break;

			case 3:

				System.out.println("Ingrese el código del Perro a eliminar");
				codigoPerroBuscar = entrada.nextInt();
				indicePerro = -1;

				for (int i = 0; i < listaPerros.size(); i++) {

					if (listaPerros.get(i).getCodigoPerro() == codigoPerroBuscar) {
						indicePerro = i;
						break;
					}
				}

				if (indicePerro == -1) {
					System.out.println("No se encontro ningún dato");
				} else {
					listaPerros.remove(indicePerro);
					System.out.println("El perro con código " + codigoPerroBuscar + " se ha eliminado correctamente");
				}

				break;
			case 4:
				System.out.println("Ingrese la cédula del dueño");
				cedulaDuenoBuscar = entrada.nextInt();
				datosEncontrados = 0;

				for (Perro perroBuscar : listaPerros) {

					if (perroBuscar.getCedulaDueno() == cedulaDuenoBuscar) {
						datosEncontrados++;
						System.out.println("Los datos del Perro " + datosEncontrados + " son:");
						System.out.println("Codigo:\t" + perroBuscar.getCodigoPerro());
						System.out.println("Nombre:\t" + perroBuscar.getNombre());

					}

				}

				if (datosEncontrados == 0) {
					System.out.println("No se encontro ningún dato");
				}

				break;

			case 5:
				System.out.println("Ingrese la raza del Perro");
				razaPerroBuscar = entrada.next();
				datosEncontrados = 0;

				for (Perro perroBuscar : listaPerros) {

					if (perroBuscar.getRaza().equalsIgnoreCase(razaPerroBuscar)) {
						datosEncontrados++;
					}

				}

				if (datosEncontrados == 0) {
					System.out.println("No se encontro ningún dato");
				} else {
					System.out
							.println("La cantidad de perros de raza " + razaPerroBuscar + " son: " + datosEncontrados);
				}
				break;
			case 6:
				System.out.println("Ingrese la localidad donde habita el Perro");
				localidadPerroBuscar = entrada.next();
				datosEncontrados = 0;

				for (Perro perroBuscar : listaPerros) {

					if (perroBuscar.getLocalidad().equalsIgnoreCase(localidadPerroBuscar)) {
						datosEncontrados++;
					}

				}

				if (datosEncontrados == 0) {
					System.out.println("No se encontro ningún dato");
				} else {
					System.out.println("La cantidad de perros que habitan en " + localidadPerroBuscar + " son: "
							+ datosEncontrados);
				}
				break;
			case 7:
				System.out.println("Gracias");

				break;

			default:
				System.out.println("La opción digitada es incorrecta");

			}
		}

		entrada.close();

	}

}

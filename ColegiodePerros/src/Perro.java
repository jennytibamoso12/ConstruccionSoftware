
public class Perro {

	private int codigoPerro;
	private String nombre;
	private String raza;
	private String localidad;
	private int cedulaDueno;
	private String nombreDueno;

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(int codigoPerro, String nombre, String raza, String localidad, int cedulaDueno, String nombreDueno) {
		super();
		this.codigoPerro = codigoPerro;
		this.nombre = nombre;
		this.raza = raza;
		this.localidad = localidad;
		this.cedulaDueno = cedulaDueno;
		this.nombreDueno = nombreDueno;
	}

	public int getCodigoPerro() {
		return codigoPerro;
	}

	public void setCodigoPerro(int codigoPerro) {
		this.codigoPerro = codigoPerro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getCedulaDueno() {
		return cedulaDueno;
	}

	public void setCedulaDueno(int cedulaDueno) {
		this.cedulaDueno = cedulaDueno;
	}

	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}

}

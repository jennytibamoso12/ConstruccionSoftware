
public class Pendulo {

	private int longitud;
    private int aceleracion;
    
          
	public Pendulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pendulo(int longitud, int aceleracion) {
		super();
		this.longitud = longitud;
		this.aceleracion = aceleracion;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getAceleracion() {
		return aceleracion;
	}
	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}
	
	public double calcularPeriodo() {
		return (2*Math.PI*(Math.sqrt((this.aceleracion/this.longitud))));
	}
	
}


public class Ascensor {

	private int numeroPisos;
	private int numeroSotanos;
	private int pisoActual;

	public Ascensor(int numeroPisos, int numeroSotanos, int pisoActual) {
		super();
		this.numeroPisos = numeroPisos;
		this.numeroSotanos = numeroSotanos;
		this.pisoActual = pisoActual;
	}

	public Ascensor() {
		super();
		pisoActual = 1;
	}

	public int getNumeroPisos() {
		return numeroPisos;
	}

	public void setNumeroPisos(int numeroPisos) {
		this.numeroPisos = numeroPisos;
	}

	public int getNumeroSotanos() {
		return numeroSotanos;
	}

	public void setNumeroSotanos(int numeroSotanos) {
		this.numeroSotanos = numeroSotanos;
	}

	public int getPisoActual() {
		return pisoActual;
	}

	public void setPisoActual(int pisoActual) {
		this.pisoActual = pisoActual;
	}

	public int calcularPisoSiguiente() {

		if (pisoActual == -1) {
			pisoActual = 1;
		} else if (pisoActual == numeroPisos) {
			pisoActual = numeroPisos;
		} else {
			pisoActual = pisoActual + 1;
		}

		return pisoActual;

	}

	public int calcularPisoAnterior() {

		if (pisoActual == 1) {
			pisoActual = -1;
		} else if (pisoActual == (-1 * numeroSotanos)) {
			pisoActual = (-1 * numeroSotanos);
		} else {
			pisoActual = pisoActual - 1;
		}

		return pisoActual;

	}

	public int calcularPisosAtender() {

		return (numeroPisos + numeroSotanos);
	}

}

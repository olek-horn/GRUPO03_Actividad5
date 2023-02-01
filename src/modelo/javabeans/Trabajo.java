package modelo.javabeans;

public class Trabajo {
	
	/*
	 * Se definen los atributos privados
	 */
	private String idTrabajo, descripcion;
	private double minSalario, maxSalario;
	
	/*
	 * Se crea el constructor vacio
	 */
	public Trabajo() {
		super();
	}
	
	/*
	 * Se crea el constructor con todos los atributos
	 */
	public Trabajo(String idTrabajo, String descripcion, double minSalario, double maxSalario) {
		super();
		this.idTrabajo = idTrabajo;
		this.descripcion = descripcion;
		this.minSalario = minSalario;
		this.maxSalario = maxSalario;
	}

	/*
	 * Se crean los getter and setter de todos los atributos
	 */
	public String getIdTrabajo() {
		return idTrabajo;
	}
	public void setIdTrabajo(String idTrabajo) {
		this.idTrabajo = idTrabajo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getMinSalario() {
		return minSalario;
	}
	public void setMinSalario(double minSalario) {
		this.minSalario = minSalario;
	}
	public double getMaxSalario() {
		return maxSalario;
	}
	public void setMaxSalario(double maxSalario) {
		this.maxSalario = maxSalario;
	}

	/*
	 * Se redefinen los metodos de Object
	 */
	@Override
	public String toString() {
		return "Trabajo [idTrabajo=" + idTrabajo + ", descripcion=" + descripcion + ", minSalario=" + minSalario
				+ ", maxSalario=" + maxSalario + "]";
	}
		
}

package modelo.javabeans;

import java.util.Objects;

public class Departamento {

	/*
	 * Se definen los atributos privados
	 */
	private int idDepar;
	private String descripcion;
	private Localidad localidad;
	
	/*
	 * Se crea el constructor vacio
	 */
	public Departamento() {
		super();
	}
	
	/*
	 * Se crea el constructor con todos los atributos
	 */
	public Departamento(int idDepar, String descripcion, Localidad localidad) {
		super();
		this.idDepar = idDepar;
		this.descripcion = descripcion;
		this.localidad = localidad;
	}

	/*
	 * Se crean los getter and setter de todos los atributos
	 */
	public int getIdDepar() {
		return idDepar;
	}

	public void setIdDepar(int idDepar) {
		this.idDepar = idDepar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	/*
	 * Se redefinen los metodos de Object
	 */
	@Override
	public String toString() {
		return "Departamento [idDepar=" + idDepar + ", descripcion=" + descripcion + ", localidad=" + localidad + "]";
	}
	
	/*
	 * Se genera el hashCode de idDepar
	 */
	@Override
	public int hashCode() {
		return Objects.hash(idDepar);
	}

	/*
	 * Se genera equals de idDepar
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Departamento))
			return false;
		Departamento other = (Departamento) obj;
		return idDepar == other.idDepar;
	}
	
}

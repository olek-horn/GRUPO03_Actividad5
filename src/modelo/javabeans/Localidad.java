package modelo.javabeans;

import java.util.Objects;

public class Localidad {
	
	/*
	 * Se definen los atributos privados
	 */
	private int idLocalidad;
	private String direccion, ciudad, pais;

	/*
	 * Se crea el constructor vacio
	 */
	public Localidad() {
		super();
	}
	
	/*
	 * Se crea el constructor con todos los atributos
	 */
	public Localidad(int idLocalidad, String direccion, String ciudad, String pais) {
		super();
		this.idLocalidad = idLocalidad;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
	}

	/*
	 * Se crean los getter and setter de todos los atributos
	 */
	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	/*
	 * Se redefinen los metodos de Object
	 */
	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", direccion=" + direccion + ", ciudad=" + ciudad + ", pais="
				+ pais + "]";
	}
	
	/*
	 * Se genera el hashCode de idLocalidad
	 */
	@Override
	public int hashCode() {
		return Objects.hash(idLocalidad);
	}
	
	/*
	 * Se genera equals de idLocalidad
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Localidad))
			return false;
		Localidad other = (Localidad) obj;
		return idLocalidad == other.idLocalidad;
	}
	
}

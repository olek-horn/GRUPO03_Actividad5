package modelo.javabeans;

import java.util.Objects;

public class Empleado {
	
	/*
	 * Se definen los atributos privados
	 */
	private int idEmpleado;
	private String nombre, apellidos, email;
	private char genero;
	private double salario, comision;
	private Trabajo trabajo;
	private Departamento departamento;
	
	/*
	 * Se crea el constructor vacio
	 */
	public Empleado() {
		super();
	}
	
	/*
	 * Se crea el constructor con todos los atributos
	 */
	public Empleado(int idEmpleado, String nombre, String apellidos, char genero, String email, double salario,
			double comision, Trabajo trabajo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.email = email;
		this.salario = salario;
		this.comision = comision;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}
	
	/*
	 * Se crean los getter and setter de todos los atributos
	 */
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	public Trabajo getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	/*
	 * Se redefinen los metodos de Object
	 */
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero="
				+ genero + ", email=" + email + ", salario=" + salario + ", comision=" + comision + ", trabajo="
				+ trabajo + ", departamento=" + departamento + "]";
	}
	
	/*
	 * Se genera el hashCode de idEmpleado
	 */
	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	/*
	 * Se genera equals de idEmpleado
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}

	//Devuelve el salario Bruto total(salario+comision)
	public double salarioBruto() {
		return salario+comision;
	}
	
	//Devuelve salario Mensual dependiendo de los meses
	public double salarioMensual(int meses) {
		return (salario+comision)/meses; 
	}
	
	//Devuelve el literal del genero
	public String literalSexo() {
		String sexo = new String();
			switch (genero){
			
			case 'H','h':
				sexo="Hombre";
			break;
			
			case 'M','m':
				sexo="Mujer";
			break;
			}
		return sexo;
	}
	
	//Devuelve el email de la persona
	public String obtenerEmail() {
		String[] parte = apellidos.split(" ");
		String correo = (nombre.charAt(0)+parte[0]+"@next.com").toLowerCase();
		return correo;
	}	
	
	//Devuelve el nombre completo
	public String nombreCompleto() {
		return nombre+" "+apellidos;
	}

}

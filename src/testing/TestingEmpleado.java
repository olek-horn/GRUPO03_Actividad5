package testing;

import modelo.javabeans.Departamento;
import modelo.javabeans.Empleado;
import modelo.javabeans.Localidad;
import modelo.javabeans.Trabajo;

public class TestingEmpleado {

	public static void main(String[] args) {
		
		/*
		 * Se crean tres Objetos de la clase Localidad
		 */
		Localidad lo1 = new Localidad(10744, "Avenida de Mirat, 34 , 4ºC", "Salamanca", "España");
		Localidad lo2 = new Localidad(10712, "Calle Santa Susana, 103", "Oviedo", "España");
		Localidad lo3 = new Localidad(10788, "Avenida Padre Méndez, 1, 1ºIZ", "Almeria", "España");
		
		/*
		 * Se crean tres Objetos de la clase Departamento relacionados con la clase Localidad
		 */
		Departamento de1 = new Departamento(56, "Financiero", lo1);
		Departamento de2 = new Departamento(45, "RRHH", lo2);
		Departamento de3 = new Departamento(02, "Soporte Interno", lo3);
		
		/*
		 * Se crean tres Objetos de la clase Trabajo
		 */
		Trabajo tr1 = new Trabajo("TKT02-478", "Auditor Financiero", 18000, 32500 );
		Trabajo tr2 = new Trabajo("TKT02-987", "Auxiliar Administrativo", 14000, 18000);
		Trabajo tr3 = new Trabajo("TKT02-271", "Técnico Soporte Linux L3", 25000, 42000);
		
		/*
		 * Se crean tres Objetos de la clase Empleado relacionados con la clase Trabajo y Departamento
		 */
		Empleado em1 = new Empleado(65954, "Alberto", "Ruiz Blanco", 'H', null, 23450.50, 750.50 , tr1, de1);
		Empleado em2 = new Empleado(66001, "Maria Isabel", "Prieto Sanz", 'M', null, 14500, 0.0 , tr2, de2);
		Empleado em3 = new Empleado(64403, "Maria Paz", "Peral Castro", 'M', null, 32000, 3200 , tr3, de3);
		
		/*
		 * Sacamos la información del Empleado 1: Nombre, apellidos, género, nombre del departamento, 
		 * nombre de su trabajo, dirección , ciudad y país.
		 */
		System.out.printf("%s, %s, %s, %s, %s, %s, %s y %s\n"
						 ,em1.getNombre(),em1.getApellidos(),em1.literalSexo(),em1.getDepartamento().getDescripcion()
						 ,em1.getTrabajo().getDescripcion(),em1.getDepartamento().getLocalidad().getDireccion()
						 ,em1.getDepartamento().getLocalidad().getCiudad()
						 ,em1.getDepartamento().getLocalidad().getPais());
		/*
		 * Extraemos los datos de Trabajo del Empleado 2
		 */
		System.out.println(em2.getTrabajo());
		/*
		 * Extraemos los datos de Departamento del Empleado 3
		 */
		System.out.println(em3.getDepartamento());
	}

}

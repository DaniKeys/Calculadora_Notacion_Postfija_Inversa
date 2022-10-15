package datos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AntiguedadEmpleados extends Entity {

	String fechaDeIngreso;
	
	
	public AntiguedadEmpleados(String nombre, String apellido, String genero, LocalDate fecha_denacimiento,
			String cargo, String antiguedad, String fechaDeIngreso) {
		super(nombre, apellido, genero, fecha_denacimiento, cargo, antiguedad);
		// TODO Auto-generated constructor stub
		this.fechaDeIngreso = fechaDeIngreso;
	}


	public void setAntiguedadEmpleadoEnMeses(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	

	
	@Override
	public String toString() {
		return "Entity [nombre=" + super.nombre + ", apellido=" + super.apellido + ", genero=" + super.genero + ", fecha_de_nacimiento="
				+ super.fecha_denacimiento + ", cargo=" + super.cargo + ", antiguedad=" + super.antiguedad + ", fecha_de_ingreso=" + this.fechaDeIngreso + "]";
	}

	
	
	
	
	
}

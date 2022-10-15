package datos;

import java.time.LocalDate;

public class EmpleadosMayorAge extends Entity{

	public EmpleadosMayorAge(String nombre, String apellido, String genero, String fecha_denacimiento, String cargo,
			String antiguedad) {
		super(nombre, apellido, genero, fecha_denacimiento, cargo, antiguedad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmpleadosMayorAge [nombre=" + super.nombre + ", apellido=" + super.apellido + ", genero=" + super.genero
				+ ", fecha_de_nacimiento=" + super.fecha_de_nacimiento + ", cargo=" + super.cargo + ", antiguedad=" + super.antiguedad
				+ "]";
	}

	
	
	
}

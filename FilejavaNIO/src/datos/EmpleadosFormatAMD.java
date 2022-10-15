package datos;

import java.time.LocalDate;

public class EmpleadosFormatAMD extends Entity{

	public EmpleadosFormatAMD(String nombre, String apellido, String genero, LocalDate fecha_denacimiento, String cargo,
			String antiguedad) {
		super(nombre, apellido, genero, fecha_denacimiento, cargo, antiguedad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmpleadosFormatAMD [nombre=" + super.nombre + ", apellido=" + super.apellido + ", genero=" + super.genero
				+ ", fecha_denacimiento=" + super.fecha_denacimiento + ", cargo=" + super.cargo + ", antiguedad=" + super.antiguedad
				+ "]";
	}

	
	
	
	
}

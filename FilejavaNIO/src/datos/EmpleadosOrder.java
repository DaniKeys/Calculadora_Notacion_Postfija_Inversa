package datos;

import java.time.LocalDate;

public class EmpleadosOrder extends Entity implements Comparable<EmpleadosOrder> {

	String fecha_de_nacimiento;
	
	public EmpleadosOrder(String nombre, String apellido, String genero, String fecha_de_nacimiento) {
		super(nombre, apellido, genero);
		this.fecha_de_nacimiento= fecha_de_nacimiento;
		// TODO Auto-generated constructor stub
	}


	public String toString() {
		return "EmpleadosOrder [nombre=" + super.nombre + ", apellido=" + super.apellido + ", genero=" + super.genero
				+ ", fecha_de_nacimiento=" + this.fecha_de_nacimiento + "]";
	}

	@Override
	public int compareTo(EmpleadosOrder o) {

		return super.nombre.compareTo(o.nombre);
	}

}

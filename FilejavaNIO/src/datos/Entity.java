package datos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Entity {

	String nombre;
	String apellido;
	String genero;
    String fecha_de_nacimiento;
    LocalDate fecha_denacimiento;
	String cargo;
	String antiguedad;
	
	public Entity(String nombre, String apellido, String genero, String fecha_de_nacimiento, String cargo,
			String antiguedad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.cargo = cargo;
		this.antiguedad = antiguedad;

	}
	public Entity(String nombre, String apellido, String genero, LocalDate fecha_denacimiento, String cargo,
			String antiguedad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.fecha_denacimiento = fecha_denacimiento;
		this.cargo = cargo;
		this.antiguedad = antiguedad;

	}

	public Entity(String nombre, String apellido, String genero) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
	

	}
	
	
	public int getMayor_age() {

		DateTimeFormatter formatDateAMD = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate fecha_nacimiento_format = LocalDate.parse(this.fecha_de_nacimiento, formatDateAMD);
		LocalDate fechaActual = LocalDate.now();
		Period menores2004 = Period.between(fecha_nacimiento_format, fechaActual);
		int años = menores2004.getYears();

		return años;

	}
	
	public String getfechaDeIngreso() {
		
		String antiguedadCast = this.antiguedad;
		int fecha_ingreso_int = Integer.parseInt(antiguedadCast);
		Period meses = Period.ofMonths(fecha_ingreso_int);
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaIngreso = fechaActual.minus(meses);
		DateTimeFormatter formatDateM = DateTimeFormatter.ofPattern("MM/yyyy");
		String fecha_ingreso_format = formatDateM.format(fechaIngreso);
		
		return fecha_ingreso_format;
	}
	
  public LocalDate getFormatFechaNacimientoAMD() {
		
		DateTimeFormatter formatDateAMD = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date_format_AMD = LocalDate.parse(this.fecha_de_nacimiento, formatDateAMD);
		
		return date_format_AMD;
		
	}
	public String getFormatFechaNacimientoDMA() {
		
		DateTimeFormatter formatDateAMD = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter formatDateDMA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date_format_AMD = LocalDate.parse(this.fecha_de_nacimiento, formatDateAMD);
		String fechaDeNacimientoDMA = formatDateDMA.format(date_format_AMD);
		
		return fechaDeNacimientoDMA;
		
	}
	
	
	public Entity() {
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {

		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFecha_de_nacimiento() {

		return fecha_de_nacimiento;
	}

	public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}

	public String getCargo() {
		return cargo;
	}

	@Override
	public String toString() {
		return "Entity [nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", fecha_de_nacimiento="
				+ fecha_de_nacimiento + ", cargo=" + cargo + ", antiguedad=" + antiguedad + "]";
}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

}

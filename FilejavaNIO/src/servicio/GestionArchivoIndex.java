package servicio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import crud.EscribirArchivo;
import datos.AntiguedadEmpleados;
import datos.EmpleadosFormatAMD;
import datos.EmpleadosMayorAge;
import datos.EmpleadosOrder;
import datos.Entity;

public class GestionArchivoIndex {

	public static void leerArchivo(String filePpal) {
		
		List<String> empleados = new ArrayList<>();
		try {
			empleados = Files.readAllLines(Paths.get(filePpal),StandardCharsets.UTF_8);
		} catch (IOException e) {


		}
		

		String empl1 = empleados.get(0);
		String empl2 = empleados.get(1);
		String empl3 = empleados.get(2);
		String empl4 = empleados.get(3);
		String empl5 = empleados.get(4);
		String empl6 = empleados.get(5);
		String empl7 = empleados.get(6);
		String empl8 = empleados.get(7);
		String empl9 = empleados.get(8);
		String empl10 = empleados.get(9);
		String empl11 = empleados.get(10);

		String[] split1 = empl1.split("\\|");
		String[] split2 = empl2.split("\\|");
		String[] split3 = empl3.split("\\|");
		String[] split4 = empl4.split("\\|");
		String[] split5 = empl5.split("\\|");
		String[] split6 = empl6.split("\\|");
		String[] split7 = empl7.split("\\|");
		String[] split8 = empl8.split("\\|");
		String[] split9 = empl9.split("\\|");
		String[] split10 = empl10.split("\\|");
		String[] split11 = empl11.split("\\|");

		Entity empleado1 = new Entity(split1[0], split1[1], split1[2], split1[3], split1[4], split1[5]);
		Entity empleado2 = new Entity(split2[0], split2[1], split2[2], split2[3], split2[4], split2[5]);
		Entity empleado3 = new Entity(split3[0], split3[1], split3[2], split3[3], split3[4], split3[5]);
		Entity empleado4 = new Entity(split4[0], split4[1], split4[2], split4[3], split4[4], split4[5]);
		Entity empleado5 = new Entity(split5[0], split5[1], split5[2], split5[3], split5[4], split5[5]);
		Entity empleado6 = new Entity(split6[0], split6[1], split6[2], split6[3], split6[4], split6[5]);
		Entity empleado7 = new Entity(split7[0], split7[1], split7[2], split7[3], split7[4], split7[5]);
		Entity empleado8 = new Entity(split8[0], split8[1], split8[2], split8[3], split8[4], split8[5]);
		Entity empleado9 = new Entity(split9[0], split9[1], split9[2], split9[3], split9[4], split9[5]);
		Entity empleado10 = new Entity(split10[0], split10[1], split10[2], split10[3], split10[4], split10[5]);
		Entity empleado11 = new Entity(split11[0], split11[1], split11[2], split11[3], split11[4], split11[5]);

		List<Entity> empleadosFilter = new ArrayList<>();

		empleadosFilter.add(empleado1);
		empleadosFilter.add(empleado2);
		empleadosFilter.add(empleado3);
		empleadosFilter.add(empleado4);
		empleadosFilter.add(empleado5);
		empleadosFilter.add(empleado6);
		empleadosFilter.add(empleado7);
		empleadosFilter.add(empleado8);
		empleadosFilter.add(empleado9);
		empleadosFilter.add(empleado10);
		empleadosFilter.add(empleado11);

		List<LocalDate> emplFormatAMD = new ArrayList<>();
		for (Entity findByFormatamd : empleadosFilter) {
			emplFormatAMD.add(findByFormatamd.getFormatFechaNacimientoAMD());

		}

		EmpleadosFormatAMD empleado01 = new EmpleadosFormatAMD(split1[0], split1[1], split1[2], emplFormatAMD.get(0),
				split1[4], split1[5]);
		EmpleadosFormatAMD empleado02 = new EmpleadosFormatAMD(split2[0], split2[1], split2[2], emplFormatAMD.get(1),
				split2[4], split2[5]);
		EmpleadosFormatAMD empleado03 = new EmpleadosFormatAMD(split3[0], split3[1], split3[2], emplFormatAMD.get(2),
				split3[4], split3[5]);
		EmpleadosFormatAMD empleado04 = new EmpleadosFormatAMD(split4[0], split4[1], split4[2], emplFormatAMD.get(3),
				split4[4], split4[5]);
		EmpleadosFormatAMD empleado05 = new EmpleadosFormatAMD(split5[0], split5[1], split5[2], emplFormatAMD.get(4),
				split5[4], split5[5]);
		EmpleadosFormatAMD empleado06 = new EmpleadosFormatAMD(split6[0], split6[1], split6[2], emplFormatAMD.get(5),
				split6[4], split6[5]);
		EmpleadosFormatAMD empleado07 = new EmpleadosFormatAMD(split7[0], split7[1], split7[2], emplFormatAMD.get(6),
				split7[4], split7[5]);
		EmpleadosFormatAMD empleado08 = new EmpleadosFormatAMD(split8[0], split8[1], split8[2], emplFormatAMD.get(7),
				split8[4], split8[5]);
		EmpleadosFormatAMD empleado09 = new EmpleadosFormatAMD(split9[0], split9[1], split9[2], emplFormatAMD.get(8),
				split9[4], split9[5]);
		EmpleadosFormatAMD empleado010 = new EmpleadosFormatAMD(split10[0], split10[1], split10[2],
				emplFormatAMD.get(9), split10[4], split10[5]);
		EmpleadosFormatAMD empleado011 = new EmpleadosFormatAMD(split11[0], split11[1], split11[2],
				emplFormatAMD.get(10), split11[4], split11[5]);

		List<Entity> empleadosFormatDateAMD = new ArrayList<>();

		empleadosFormatDateAMD.add(empleado01);
		empleadosFormatDateAMD.add(empleado02);
		empleadosFormatDateAMD.add(empleado03);
		empleadosFormatDateAMD.add(empleado04);
		empleadosFormatDateAMD.add(empleado05);
		empleadosFormatDateAMD.add(empleado06);
		empleadosFormatDateAMD.add(empleado07);
		empleadosFormatDateAMD.add(empleado08);
		empleadosFormatDateAMD.add(empleado09);
		empleadosFormatDateAMD.add(empleado010);
		empleadosFormatDateAMD.add(empleado011);

		List<Entity> emplMasculinos = new ArrayList<>();
		List<Entity> emplFemeninos = new ArrayList<>();

		for (Entity findByGenre : empleadosFormatDateAMD) {
			if (findByGenre.getGenero().startsWith("M")) {
				emplMasculinos.add(findByGenre);
			}
		}

		for (Entity findByGenre : empleadosFormatDateAMD) {
			if (findByGenre.getGenero().startsWith("F")) {
				emplFemeninos.add(findByGenre);
			}
		}

		EscribirArchivo insertEM = null;
		EscribirArchivo insertEF = null;

		String formato = ".txt";
		String ruta2 = "/home/danielcamacho/Escritorio/fileEmpleados_M" + formato;
		String ruta3 = "/home/danielcamacho/Escritorio/fileEmpleados_F" + formato;

		insertEF.escribirArchivoEF(ruta3, emplFemeninos);
		insertEM.escribirArchivoEM(ruta2, emplMasculinos);

		List<String> empleadosfilterOrderAsc = new ArrayList<>();
		for (Entity formatOrderAsc : empleadosFilter) {
			empleadosfilterOrderAsc.add(formatOrderAsc.getFormatFechaNacimientoDMA());
		}

		EmpleadosOrder emplDateEscencial1 = new EmpleadosOrder(split1[0], split1[1], split1[2],
				empleadosfilterOrderAsc.get(0));
		EmpleadosOrder emplDateEscencial2 = new EmpleadosOrder(split2[0], split2[1], split2[2],
				empleadosfilterOrderAsc.get(1));
		EmpleadosOrder emplDateEscencial3 = new EmpleadosOrder(split3[0], split3[1], split3[2],
				empleadosfilterOrderAsc.get(2));
		EmpleadosOrder emplDateEscencial4 = new EmpleadosOrder(split4[0], split4[1], split4[2],
				empleadosfilterOrderAsc.get(3));
		EmpleadosOrder emplDateEscencial5 = new EmpleadosOrder(split5[0], split5[1], split5[2],
				empleadosfilterOrderAsc.get(4));
		EmpleadosOrder emplDateEscencial6 = new EmpleadosOrder(split6[0], split6[1], split7[2],
				empleadosfilterOrderAsc.get(5));
		EmpleadosOrder emplDateEscencial7 = new EmpleadosOrder(split7[0], split7[1], split7[2],
				empleadosfilterOrderAsc.get(6));
		EmpleadosOrder emplDateEscencial8 = new EmpleadosOrder(split8[0], split8[1], split8[2],
				empleadosfilterOrderAsc.get(7));
		EmpleadosOrder emplDateEscencial9 = new EmpleadosOrder(split9[0], split9[1], split10[2],
				empleadosfilterOrderAsc.get(8));
		EmpleadosOrder emplDateEscencial10 = new EmpleadosOrder(split10[0], split10[1], split10[2],
				empleadosfilterOrderAsc.get(9));
		EmpleadosOrder emplDateEscencial11 = new EmpleadosOrder(split11[0], split11[1], split11[2],
				empleadosfilterOrderAsc.get(10));

		List<EmpleadosOrder> emplOrdenAlfabetico = new ArrayList<>();

		emplOrdenAlfabetico.add(emplDateEscencial1);
		emplOrdenAlfabetico.add(emplDateEscencial2);
		emplOrdenAlfabetico.add(emplDateEscencial3);
		emplOrdenAlfabetico.add(emplDateEscencial4);
		emplOrdenAlfabetico.add(emplDateEscencial5);
		emplOrdenAlfabetico.add(emplDateEscencial6);
		emplOrdenAlfabetico.add(emplDateEscencial7);
		emplOrdenAlfabetico.add(emplDateEscencial8);
		emplOrdenAlfabetico.add(emplDateEscencial9);
		emplOrdenAlfabetico.add(emplDateEscencial10);
		emplOrdenAlfabetico.add(emplDateEscencial11);

		Collections.sort(emplOrdenAlfabetico);
		EscribirArchivo insertOrderAsc = null;
		String ruta4 = "/home/danielcamacho/Escritorio/fileEmpleados_OrderAsc";

		insertOrderAsc.escribirArchivoOrderAsc(ruta4, emplOrdenAlfabetico);

		EmpleadosMayorAge emplMayorAge1 = new EmpleadosMayorAge(split1[0], split1[1], split1[2], split1[3], split1[4],
				split1[5]);
		EmpleadosMayorAge emplMayorAge2 = new EmpleadosMayorAge(split2[0], split2[1], split2[2], split2[3], split2[4],
				split2[5]);
		EmpleadosMayorAge emplMayorAge3 = new EmpleadosMayorAge(split3[0], split3[1], split3[2], split3[3], split3[4],
				split3[5]);
		EmpleadosMayorAge emplMayorAge4 = new EmpleadosMayorAge(split4[0], split4[1], split4[2], split4[3], split4[4],
				split4[5]);
		EmpleadosMayorAge emplMayorAge5 = new EmpleadosMayorAge(split5[0], split5[1], split5[2], split5[3], split5[4],
				split5[5]);
		EmpleadosMayorAge emplMayorAge6 = new EmpleadosMayorAge(split6[0], split6[1], split6[2], split6[3], split6[4],
				split6[5]);
		EmpleadosMayorAge emplMayorAge7 = new EmpleadosMayorAge(split7[0], split7[1], split7[2], split7[3], split7[4],
				split7[5]);
		EmpleadosMayorAge emplMayorAge8 = new EmpleadosMayorAge(split8[0], split8[1], split8[2], split8[3], split8[4],
				split8[5]);
		EmpleadosMayorAge emplMayorAge9 = new EmpleadosMayorAge(split9[0], split9[1], split9[2], split9[3], split9[4],
				split9[5]);
		EmpleadosMayorAge emplMayorAge10 = new EmpleadosMayorAge(split10[0], split10[1], split10[2], split10[3],
				split10[4], split10[5]);
		EmpleadosMayorAge emplMayorAge11 = new EmpleadosMayorAge(split11[0], split11[1], split11[2], split11[3],
				split11[4], split11[5]);

		List<EmpleadosMayorAge> emplMayorEdad = new ArrayList<>();

		emplMayorEdad.add(emplMayorAge1);
		emplMayorEdad.add(emplMayorAge2);
		emplMayorEdad.add(emplMayorAge3);
		emplMayorEdad.add(emplMayorAge4);
		emplMayorEdad.add(emplMayorAge5);
		emplMayorEdad.add(emplMayorAge6);
		emplMayorEdad.add(emplMayorAge7);
		emplMayorEdad.add(emplMayorAge8);
		emplMayorEdad.add(emplMayorAge9);
		emplMayorEdad.add(emplMayorAge10);
		emplMayorEdad.add(emplMayorAge11);

		List<Entity> empleadosMayoresdeEdad = new ArrayList<>();
		for (EmpleadosMayorAge findByAge : emplMayorEdad) {
			if (findByAge.getMayor_age() >= 18) {
				empleadosMayoresdeEdad.add(findByAge);
			}
		}

		EscribirArchivo insertMayorEdad = null;
		String ruta5 = "/home/danielcamacho/Escritorio/fileEmpleados_MayorAge";

		insertMayorEdad.escribirArchivoMayorEdad(ruta5, empleadosMayoresdeEdad);

		List<String> intFechaDeIngreso = new ArrayList<>();

		for (Entity findByAntiguedad : emplMayorEdad) {
			intFechaDeIngreso.add(findByAntiguedad.getfechaDeIngreso());
		}

		AntiguedadEmpleados aE1 = new AntiguedadEmpleados(split1[0], split1[1], split1[2], emplFormatAMD.get(0),
				split1[4], split1[5], intFechaDeIngreso.get(0));
		AntiguedadEmpleados aE2 = new AntiguedadEmpleados(split2[0], split2[1], split2[2], emplFormatAMD.get(1),
				split2[4], split2[5], intFechaDeIngreso.get(1));
		AntiguedadEmpleados aE3 = new AntiguedadEmpleados(split3[0], split3[1], split3[2], emplFormatAMD.get(2),
				split3[4], split3[5], intFechaDeIngreso.get(2));
		AntiguedadEmpleados aE4 = new AntiguedadEmpleados(split4[0], split4[1], split4[2], emplFormatAMD.get(3),
				split4[4], split4[5], intFechaDeIngreso.get(3));
		AntiguedadEmpleados aE5 = new AntiguedadEmpleados(split5[0], split5[1], split5[2], emplFormatAMD.get(4),
				split5[4], split5[5], intFechaDeIngreso.get(4));
		AntiguedadEmpleados aE6 = new AntiguedadEmpleados(split6[0], split6[1], split6[2], emplFormatAMD.get(5),
				split6[4], split6[5], intFechaDeIngreso.get(5));
		AntiguedadEmpleados aE7 = new AntiguedadEmpleados(split7[0], split7[1], split7[2], emplFormatAMD.get(6),
				split7[4], split7[5], intFechaDeIngreso.get(6));
		AntiguedadEmpleados aE8 = new AntiguedadEmpleados(split8[0], split8[1], split8[2], emplFormatAMD.get(7),
				split8[4], split8[5], intFechaDeIngreso.get(7));
		AntiguedadEmpleados aE9 = new AntiguedadEmpleados(split9[0], split9[1], split9[2], emplFormatAMD.get(8),
				split9[4], split9[5], intFechaDeIngreso.get(8));
		AntiguedadEmpleados aE10 = new AntiguedadEmpleados(split10[0], split10[1], split10[2], emplFormatAMD.get(9),
				split10[4], split10[5], intFechaDeIngreso.get(9));
		AntiguedadEmpleados aE11 = new AntiguedadEmpleados(split11[0], split11[1], split11[2], emplFormatAMD.get(10),
				split11[4], split11[5], intFechaDeIngreso.get(10));

		List<AntiguedadEmpleados> fecha_de_ingreso = new ArrayList<>();

		fecha_de_ingreso.add(aE1);
		fecha_de_ingreso.add(aE2);
		fecha_de_ingreso.add(aE3);
		fecha_de_ingreso.add(aE4);
		fecha_de_ingreso.add(aE5);
		fecha_de_ingreso.add(aE6);
		fecha_de_ingreso.add(aE7);
		fecha_de_ingreso.add(aE8);
		fecha_de_ingreso.add(aE9);
		fecha_de_ingreso.add(aE10);
		fecha_de_ingreso.add(aE11);

		List<AntiguedadEmpleados> empleadosCargosDirecivos = new ArrayList<>();
		List<AntiguedadEmpleados> empleadosCargosAuxiliares = new ArrayList<>();
		List<AntiguedadEmpleados> empleadosCargosGerenciales = new ArrayList<>();

		for (AntiguedadEmpleados findByCargo : fecha_de_ingreso) {
			if (findByCargo.getCargo().contains("Director")) {
				empleadosCargosDirecivos.add(findByCargo);
			} else if (findByCargo.getCargo().contains("Auxiliar")) {
				empleadosCargosAuxiliares.add(findByCargo);
			} else if (findByCargo.getCargo().contains("Gerente")) {
				empleadosCargosGerenciales.add(findByCargo);
			}
		}

		String rutaConcat = "/home/danielcamacho/Escritorio/";
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
		String fechaArchivo = formatDateTime.format(fechaHoraActual);

		String ruta6 = rutaConcat + "directores" + "_" + fechaArchivo + formato;
		String ruta7 = rutaConcat + "auxiliares" + "_" + fechaArchivo + formato;
		String ruta8 = rutaConcat + "gerentes" + "_" + fechaArchivo + formato;

		EscribirArchivo insertDir = null;
		EscribirArchivo insertAux = null;
		EscribirArchivo insertGer = null;

		insertAux.escribirArchivoAuxiliares(ruta7, empleadosCargosAuxiliares);
		insertAux.escribirArchivoDirectores(ruta6, empleadosCargosDirecivos);
		insertAux.escribirArchivoGerentes(ruta8, empleadosCargosGerenciales);

	}
}

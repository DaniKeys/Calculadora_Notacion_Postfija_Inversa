package crud;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import datos.AntiguedadEmpleados;
import datos.EmpleadosMayorAge;
import datos.EmpleadosOrder;
import datos.Entity;

public class EscribirArchivo {
	
	   public static void escribirArchivoEM(String ruta2, List<Entity> TrabajdoresHombres) {
		   
		   
   		File archivo = new File(ruta2);
		 	
	        try {
	        	if(!TrabajdoresHombres.isEmpty()) {
	        		
	              	PrintWriter salida = new PrintWriter(archivo);
		 	        salida.println(TrabajdoresHombres);
		 	        salida.close();
		 	        System.out.println("Se ha generado el al archivo Empleados Masculinos");
		 	        
	        	}else{
	        		System.out.println("Archivo Empleados Masculinos es vacio, no se pudo generar el archivo");
	        	}
	        } catch (FileNotFoundException ex) {
	          
	        }
	    }
	   
	   public static void escribirArchivoEF(String ruta3, List<Entity> TrabajdoresMujeres) {
		   		File archivo = new File(ruta3);
		 	
	        try {
	        	if(!TrabajdoresMujeres.isEmpty()) {
	        		
	              	PrintWriter salida = new PrintWriter(archivo);
		 	        salida.println(TrabajdoresMujeres);
		 	        salida.close();
		 	        System.out.println("Se ha generado el al archivo Empleados Femeninos");
		 	        
	        	}else{
	        		System.out.println("Archivo Empleados Femeninos es vacio, no se pudo generar el archivo");
	        	}
	        } catch (FileNotFoundException ex) {
	          
	        }
	    }
	   
	   public static void escribirArchivoOrderAsc(String ruta4, List<EmpleadosOrder> EmpleadosOrderAsc) {
		   
		   File archivo = new File(ruta4);
		   
	        try {
	        	if(!EmpleadosOrderAsc.isEmpty()) {
	        		
	            PrintWriter salida = new PrintWriter(archivo);
	            salida.println(EmpleadosOrderAsc);
	            salida.close();
	            System.out.println("Se ha generado el archivo Empleados Orden Asc");
	            
	        	}else {
	        		System.out.println("Archivo Empleados Orden Asc es vacio, no se pudo generar archivo");
	        	}
	        } catch (FileNotFoundException ex) {
	           
	        }
	    }
	   
	   
	   public static void escribirArchivoMayorEdad(String ruta5, List<Entity> EmpleadosAgeMayor) {
		   
	        File archivo = new File(ruta5);
	        try {
	        	if(!EmpleadosAgeMayor.isEmpty()) {
	        		
	            PrintWriter salida = new PrintWriter(archivo);
	            salida.println(EmpleadosAgeMayor);
	            salida.close();
	            System.out.println("Se ha generado el archivo Mayores de edad");
	            
	        	}else {
	        		System.out.println("Archivo MayorEdad vacio, no se pudo generar archivo");
	        	}
	        } catch (FileNotFoundException ex) {
	           
	        }
	    }
	   
	   public static void escribirArchivoDirectores(String ruta6, List<AntiguedadEmpleados> EmpleadosDirectores) {
			 
		 	File archivo = new File(ruta6);
		 	
	        try {
	        	if(!EmpleadosDirectores.isEmpty()) {
	        		
	              	PrintWriter salida = new PrintWriter(archivo);
		 	        salida.println(EmpleadosDirectores);
		 	        salida.close();
		 	        System.out.println("Se ha generado el al archivo Empleados Directores");
		 	        
	        	}else{
	        		System.out.println("Archivo Empleados Directores es vacio, no se pudo generar el archivo");
	        	}
	        } catch (FileNotFoundException ex) {
	          
	        }
	    }
	   
	   
	   public static void escribirArchivoAuxiliares(String ruta7, List<AntiguedadEmpleados> EmpleadosAuxiliares) {
			 
		 	File archivo = new File(ruta7);
		 	
	        try {
	        	if(!EmpleadosAuxiliares.isEmpty()) {
	        		
	              	PrintWriter salida = new PrintWriter(archivo);
		 	        salida.println(EmpleadosAuxiliares);
		 	        salida.close();
		 	        System.out.println("Se ha generado el al archivo Empleados Auxiliares");
		 	        
	        	}else{
	        		System.out.println("Archivo Empleados Auxiliares es vacio, no se pudo generar el archivo");
	        	}
	        } catch (FileNotFoundException ex) {
	          
	        }
	    }
	   
	   
	   public static void escribirArchivoGerentes(String ruta8, List<AntiguedadEmpleados> EmpleadosGerentes) {
			 
		 	File archivo = new File(ruta8);
		 	
	        try {
	        	if(!EmpleadosGerentes.isEmpty()) {
	        		
	              	PrintWriter salida = new PrintWriter(archivo);
		 	        salida.println(EmpleadosGerentes);
		 	        salida.close();
		 	        System.out.println("Se ha generado el al archivo Empleados Gerentes");
		 	        
	        	}else{
	        		System.out.println("Archivo Empleados Gerentes es vacio, no se pudo generar el archivo");
	        	}
	        } catch (FileNotFoundException ex) {
	          
	        }
	    }
	   

}

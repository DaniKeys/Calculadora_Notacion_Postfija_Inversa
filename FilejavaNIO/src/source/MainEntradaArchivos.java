package source;

import static servicio.GestionArchivoIndex.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainEntradaArchivos {

    public static void main(String[] args) {
       
    
        String fileRead = "/home/danielcamacho/Escritorio/fileEmpleados";

       
       if(fileRead == "/home/danielcamacho/Escritorio/fileEmpleados") {
       leerArchivo(fileRead);
       }else {
    	  System.out.println("El archivo no existe");
       }
       
  }
       
    }



















	
	
	


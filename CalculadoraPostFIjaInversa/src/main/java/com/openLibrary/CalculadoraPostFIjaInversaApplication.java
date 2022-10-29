package com.openLibrary;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.boolex.Matcher;
import service.CalculadoraImpl;




@SpringBootApplication
public class CalculadoraPostFIjaInversaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraPostFIjaInversaApplication.class, args);
		
		boolean operacionValida=false;
		Double resultado = 0.0;
		Scanner scNum = new Scanner(System.in);
		System.out.println("Ingrese operacion");
		String numIn = scNum.nextLine();
		String[] insert = numIn.split(" ");
		
		
		CalculadoraPFImpl cal = new CalculadoraPFImpl();
        resultado = cal.filterArray(insert);
   
      
      if(resultado  == null || resultado == 0.0) {
			System.out.println(" ");
		}else {
			System.out.println(resultado);
		}
    	
     
	
	
	

}
	
}

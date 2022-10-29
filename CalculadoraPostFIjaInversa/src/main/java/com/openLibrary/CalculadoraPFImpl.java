package com.openLibrary;

import java.util.Stack;
import service.CalculadoraImpl;


public class CalculadoraPFImpl {
	
    
	public Double filterArray(String[]insert){
		
		Stack<String> listNum1 = new Stack<>();
		Stack<String> listSymbol1 = new Stack<>();
		String operEstado;
		Double resultado = 0.0;
    	boolean operacionValida=true; 
 
     int i; 
 	
 	for (i = 0; i < insert.length; i++) {
 		


			if (!insert[i].equals("+") && !insert[i].equals("-") && !insert[i].equals("*")
					&& !insert[i].equals("/")) {
				listNum1.push(insert[i]);

			} else if (insert[i].equals("+") || insert[i].equals("-") || insert[i].equals("*")
					|| insert[i].equals("/")) {

				listSymbol1.add(insert[i]);
			}
			
 	}
 	
 	
 	if (insert[0].equals("+") && insert[0].equals("-") && insert[0].equals("*") && insert[0].equals("/")) {
			operacionValida = false;
			
				}else if (insert[1].equals("+") && insert[1].equals("-") && insert[1].equals("*") && insert[1].equals("/")) {
					operacionValida = false;
			}else {
				operacionValida = true;
			}
 	
 	
 	
		long pilafinalNumeros = listNum1.stream().count();
		long pilafinalSymbol = listSymbol1.stream().count();
			
	
		if(pilafinalSymbol == pilafinalNumeros -1) {
			operacionValida = true;
		}else if (pilafinalNumeros == pilafinalSymbol +1) {
			operacionValida = true;
		}else { 
			operacionValida = false;
		
			System.out.println("La operacion no es valida"); 
		}
		
		
   if(operacionValida == true) {
		CalculadoraImpl cal = new CalculadoraImpl();
     resultado = cal.calService(insert);
   }
      
 

return resultado;


	
	}



}


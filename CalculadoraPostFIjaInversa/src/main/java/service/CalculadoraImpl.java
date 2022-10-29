package service;

import java.lang.reflect.InvocationTargetException;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.function.BiFunction;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraImpl implements ICalculadora {

	
	
@Override
	public Double calService(String[] insert) {


		Stack<String> listNum = new Stack<>();
		Stack<String> listSymbol = new Stack<>();

		String resultado;
		String x = "";
		double secondNum;
		double firstNum;
    	double operacion= 0;
		String operador;
		String lastSymbol;
	

		try {

			int i;
			for (i = 0; i < insert.length; i++) {


				if (!insert[i].equals("+") && !insert[i].equals("-") && !insert[i].equals("*")
						&& !insert[i].equals("/")) {
					listNum.push(insert[i]);

				} else if (insert[i].equals("+") || insert[i].equals("-") || insert[i].equals("*")
						|| insert[i].equals("/")) {

					listSymbol.add(insert[i]);
				}

				if (insert[i].equals("+")) {

					firstNum = Double.parseDouble(listNum.pop());
					secondNum = Double.parseDouble(listNum.pop());
					operacion = firstNum + secondNum;
					resultado = x + operacion;
					listNum.push(resultado);
				}

				if (insert[i].equals("-")) {

					firstNum = Double.parseDouble(listNum.pop());
					secondNum = Double.parseDouble(listNum.pop());
					operacion = firstNum - secondNum;
					resultado = x + operacion;
					listNum.push(resultado);

				}

				if (insert[i].equals("*")) {

					firstNum = Double.parseDouble(listNum.pop());
					secondNum = Double.parseDouble(listNum.pop());
					operacion = firstNum * secondNum;
					resultado = x + operacion;
					listNum.push(resultado);

				}

				if (insert[i].equals("/")) {
					firstNum = Double.parseDouble(listNum.pop());
					secondNum = Double.parseDouble(listNum.pop());
					operacion = firstNum / secondNum;
					resultado = x + operacion;
					listNum.push(resultado);
					
					if (firstNum == 0 || secondNum  == 0) {
						System.out.println("No se puede dividir entre cero");
				
						System.exit(0);
				}
				
				}
				
		

			}

  
        
		} catch (ArithmeticException aE) {
			System.out.println("No se puede dividir entre cero");
		//validOperation = ValidOperation.ERROR_ARITHMETIC;
          return null;
		} catch (NumberFormatException e) {
			System.out.println("Por favor ingrese solo numeros");
			
		 return null;
		} catch (EmptyStackException eE) {
			System.out.println("La operacion no es valida");
			return null;
		} catch (Exception e) {
		
		}
	      return operacion;
		}




}
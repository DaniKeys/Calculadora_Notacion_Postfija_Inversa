package com.openLibrary;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import service.CalculadoraImpl;
import service.ICalculadora;


public class TestCalculadora {

	private CalculadoraPFImpl calPF = new CalculadoraPFImpl() ;
	private CalculadoraImpl calImpl = new CalculadoraImpl() ;

	
	
	@Test

	public void arithmetic_execption() {

		String[] test1 = new String[] { "0", "5.0", "/" };

		assertEquals(null, calImpl.calService(test1));

	}

	@Test

	public void number_format_exception() {

		String[] test2 = new String[] { "7", "8.0", "+", "f", "-" };

		assertEquals(null, calPF.filterArray(test2));

	}

	@Test

	public void first_and_second_element_are_symbol() {

		String[] test1 = new String[] { "-", "+", "5", "7", "-" };
		String[] test2 = new String[] { "-", "5", "+", "2", "-" };

		assertEquals(null,calPF.filterArray(test1));
		assertEquals(null,calPF.filterArray(test2));
		//assertEquals("La operacion no es valida",calImpl.calService(test2));

	}


//	@Test
//
//	public void numberformat_excepction() {
//
//		String[] test1 = new String[] { "3", "5.0", "/", "y" };
//
//		assertEquals(ValidOperation.ERROR_NUMBERFORMAT,calPF.filterArray(test1));
//
//	}






}

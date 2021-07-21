package EmpleadosTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Empleados.EmpleadoDePlanta;
import Empleados.EmpleadoPasante;
import Empleados.EmpleadoTemporario;

class EmpleadoTest {
	
	private EmpleadoTemporario empleadoTemporario;
	private EmpleadoPasante empleadoPasante;
	private EmpleadoDePlanta empleadoDePlanta;
	
	@BeforeEach
		
	void setUp() {
		
		empleadoTemporario= new EmpleadoTemporario(true, 20, 3);
		empleadoPasante= new EmpleadoPasante(40);
		empleadoDePlanta= new EmpleadoDePlanta(2);
	}
		
	

	@Test
	void testTemporario() {
		Double valor= empleadoTemporario.getSueldo();
		assertEquals(valor, 1044.0);
	}
	
	@Test
	void testPasante() {
		Double valor= empleadoPasante.getSueldo();
		assertEquals(valor, 1392.0);
		
	}
	
	@Test
	void testDePlanta() {
		Double valor= empleadoDePlanta.getSueldo();
		assertEquals(valor, 2871.0);
	}

}

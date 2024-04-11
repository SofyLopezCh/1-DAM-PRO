package pruebasJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testGetNombre() {
		//fail("Not yet implemented");
		
		Persona p1 = new Persona("Juan",23);
		assertEquals("Juan", p1.getNombre());
		
	}

	@Test
	void testSetNombre() {
	//	fail("Not yet implemented");
		
		Persona p1 = new Persona("Juan",23);
		p1.setNombre("Diana");
		assertEquals("Diana", p1.getNombre());
		
	}

	@Test
	void testGetEdad() {
		fail("Not yet implemented");
	}

	@Test
	void testSetEdad() {
		fail("Not yet implemented");
	}

	@Test
	void testEsMayorDeEdad() {
	//	fail("Not yet implemented");
		
		Persona personaMayor = new Persona("Es mayor", 50);
		
		
		
		
	}

}

package empleado;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpleadoTest {
	Empleado empleado1 = new Empleado("Marcos");
	

	@Test
	public void test() {
		assertEquals(1000, empleado1.getSueldo());
	}
	
	
	@Test
	public void test2() {
		empleado1.setSueldo(700);
	}
	@Test
	public void test3() {
		assertEquals(1700, empleado1.getSueldo());
	}

}

/**
 * 
 */
package cuentas;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author Usuario
 *
 */
class MovimientoTest extends CoreMatchers{
	private static Movimiento m;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void init(){
		m = new Movimiento();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void finish(){
		m = null;
	}

	/**
	 * Test method for {@link cuentas.Movimiento#getImporte()}.
	 */
	@Test
	void testGetImporte() {
		m.setImporte(5.0);
		assertThat("Error",m.getImporte(),is(5.0));
	}

	/**
	 * Test method for {@link cuentas.Movimiento#getConcepto()}.
	 */
	@Test
	void testGetConcepto() {
		m.setConcepto("Compra televisor");
		assertThat("Error",m.getConcepto(),is("Compra televisor"));
	}

	/**
	 * Test method for {@link cuentas.Movimiento#setConcepto(java.lang.String)}.
	 */
	@Test
	void testSetConcepto() {
		m.setConcepto("Compra televisor");
		assertThat("Error",m.getConcepto(),is("Compra televisor"));
	}

	/**
	 * Test method for {@link cuentas.Movimiento#setImporte(double)}.
	 */
	@Test
	void testSetImporte() {
		m.setImporte(5.0);
		assertThat("Error",m.getImporte(),is(5.0));
	}

}

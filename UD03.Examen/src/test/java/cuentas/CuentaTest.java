/**
 * 
 */
package cuentas;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author Usuario
 *
 */
class CuentaTest extends CoreMatchers{
	private static Cuenta c;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void init(){
		c = new Cuenta("2456", "Rafael Barranco Sevilla");
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void finish(){
		c = null;
	}

	/**
	 * Test method for {@link cuentas.Cuenta#ingresar(java.lang.String, double)}.
	 * @throws IngresoNegativoException 
	 */
	@Test
	void testIngresar() throws IngresoNegativoException {
		Movimiento m = new Movimiento();
		c.ingresar("Dinero recibido por venta televisor", 20.0);
		c.addMovimiento(m);
	
		assertThat("Error",c.getSaldo(),is(30.0));
	}

	/**
	 * Test method for {@link cuentas.Cuenta#retirar(java.lang.String, double)}.
	 * @throws IngresoNegativoException 
	 */
	@Test
	void testRetirar() throws IngresoNegativoException {
		Movimiento m = new Movimiento();
		c.ingresar("Compra de un juego", 10.0);
		c.addMovimiento(m);
	
		assertThat("Error",c.getSaldo(),is(10.0));
	}

	/**
	 * Test method for {@link cuentas.Cuenta#addMovimiento(cuentas.Movimiento)}.
	 */
	@Test
	void testAddMovimiento() {
		Movimiento m = new Movimiento();
		c.addMovimiento(m);
		

		assertEquals(m = new Movimiento(),m);
	}

}

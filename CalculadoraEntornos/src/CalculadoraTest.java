import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora c = new Calculadora(20, 10);
		int resultado = c.suma();
		assertEquals(30, resultado);
	}

	@Test
	void testResta() {
		Calculadora c = new Calculadora(20, 10);
		int resultado = c.resta();
		assertEquals(10, resultado);
	}

	@Test
	void testMultiplica() {
		Calculadora c = new Calculadora(20, 10);
		int resultado = c.multiplica();
		assertEquals(200, resultado);
	}

	@Test
	void testDivide() {
		Calculadora c = new Calculadora(20, 10);
		int resultado = c.divide();
		assertEquals(2, resultado);
	}

}

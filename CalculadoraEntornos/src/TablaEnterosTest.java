import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {

	@Test
	void testBuscarElementoTabla() {
		Integer[] tabla={0,1,2,3,4};
		TablaEnteros t = new TablaEnteros(tabla);
		boolean buscar = t.buscarElementoTabla(2);
		assertTrue(buscar);
	}
	
	@Test
	void testPosicionTabla() {
		Integer[] tabla={0,1,2,3,4};
		TablaEnteros t = new TablaEnteros(tabla);
		int posicion = t.posicionTabla(2);
		assertEquals(2, posicion);
	}

}

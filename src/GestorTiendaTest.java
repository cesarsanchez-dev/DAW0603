import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCalcularDescuento() {
		GestorTienda gestor = new GestorTienda();
		assertEquals(10, gestor.calcularDescuento(100,10));
		assertEquals(5, gestor.calcularDescuento(100, 5));
		assertEquals(0, gestor.calcularDescuento(100,3));
		//fail("Not yet implemented");		
	}

	@Test
	void testCategorizarProducto() {
		GestorTienda gestorTienda = new GestorTienda();
		assertEquals("Económico", gestorTienda.categorizarProducto(2));
		assertEquals("Estándar", gestorTienda.categorizarProducto(40));
		assertEquals("Premium", gestorTienda.categorizarProducto(60));
		//fail("Not yet implemented");
	}

	@Test
	void testBuscarProducto() {
		GestorTienda gestor = new GestorTienda();
		 String[] inventario = {"Mango","Banana", "Uva"};
		 assertEquals("Producto encontrado: Mango", gestor.buscarProducto(inventario, "Mango"));
	        assertEquals("Producto encontrado: Banana", gestor.buscarProducto(inventario, "Banana"));
	        assertEquals("Producto no encontrado", gestor.buscarProducto(inventario, "Uva"));
		//fail("Not yet implemented");        
	} 

}

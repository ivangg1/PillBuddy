public class PruebaJohana {
    import static org.junit.jupiter.api.Assertions.*;
    import org.junit.jupiter.api.Test;

    void testCrearProducto() {
        Producto p = new Producto("Mouse", 25.5);

        assertEquals("Mouse", p.getNombre());
        assertEquals(25.5, p.getPrecio());
    }

    @Test
    void testSetNombre() {
        Producto p = new Producto("Teclado", 40.0);
        p.setNombre("Teclado Mecánico");

        assertEquals("Teclado Mecánico", p.getNombre());
    }

    @Test
    void testSetPrecio() {
        Producto p = new Producto("Monitor", 150);
        p.setPrecio(200);

        assertEquals(200, p.getPrecio());
    }
}



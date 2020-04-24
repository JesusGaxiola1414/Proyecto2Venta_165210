package negocio;

import java.util.ArrayList;
import objetosNegocios.ProduVenta;
import repositories.ProductoRelVentaRepo;

/**
 *
 * @author Rayo
 */
public class ConProdV {

    private final Control control = new Control();
    private final ProductoRelVentaRepo productoVenta = control.getProductoRelVentaRepository();

    public void guardarProductoVenta(ProduVenta productoVenta) {
        this.productoVenta.guardar(productoVenta);
    }

    public boolean actualizarProductoVenta(ProduVenta productoVenta) {
        return this.productoVenta.actualizar(productoVenta);
    }

    public boolean eliminarProductoVenta(Long id) {
        return this.productoVenta.eliminar(id);
    }

    public ProduVenta obtenerProductoVentaPorId(Long id) {
        return this.productoVenta.searchById(id);
    }

    public ArrayList<ProduVenta> obtenerProductosVentas() {
        return this.productoVenta.buscarTodos();
    }

    public ArrayList<ProduVenta> obtenerProductosVentasNombre(String nombre) {
        return this.productoVenta.searchByName(nombre);
    }
}

package negocio;

import java.util.ArrayList;
import objetosNegocios.Producto;
import repositories.ProductoRepos;

/**
 *
 * @author Rayo
 */
public class ConProd {

    private final Control control = new Control();
    private final ProductoRepos productoR = control.getProductoRepository();

    public ArrayList obtenerProductos() {
        return this.productoR.buscarTodos();
    }

    public void guardarProducto(Producto producto) {
        this.productoR.guardar(producto);
    }

    public boolean eliminarProducto(Long idProducto) {
        return this.productoR.eliminar(idProducto);
    }

    public Producto obtenerPorId(Long idProducto) {
        return this.productoR.searchById(idProducto);
    }

    public boolean actualizarProducto(Producto producto) {
        return this.productoR.actualizar(producto);
    }

    public ArrayList obtenerProductosNombre(String nombre){
        return productoR.searchByName(nombre);
    }
    
    public void actualizarStock( Producto producto) {
        this.productoR.actualizarStock(producto);
    }
}

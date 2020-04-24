
package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import objetosNegocios.Cliente;
import objetosNegocios.Venta;
import repositories.VentasRep;

/**
 *
 * @author Rayo
 */
public class ConVe {

    private final Control control = new Control();
    private final VentasRep ventaR = control.getVentasRepository();

    public void guardarVenta(Venta venta) {
        this.ventaR.guardar(venta);
    }

    public boolean actualizarVenta(Venta venta) {
        return this.ventaR.actualizar(venta);
    }

    public boolean eliminarVenta(Long id) {
        return this.ventaR.eliminar(id);
    }

    public Venta obtenerVentaPorId(Long id) {
        return this.ventaR.searchById(id);
    }

    public ArrayList<Venta> obtenerVentas()  {
        return this.ventaR.buscarTodos();
    }

    public List<Venta> obtenerVentasCliente(Date inicio, Date fin, Cliente cliente) {
        return this.ventaR.obtenerVentasPorCliente(inicio, fin, cliente);
    }
}

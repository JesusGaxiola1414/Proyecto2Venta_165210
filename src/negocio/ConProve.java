package negocio;

import java.util.ArrayList;
import objetosNegocios.Prove;
import repositories.ProveedorRepos;

/**
 *
 * @author Rayo
 */
public class ConProve {

    private final Control control = new Control();
    private final ProveedorRepos pr = control.getProveedorRepository();

    public void guardarProveedor(Prove proveedor) {
        this.pr.guardar(proveedor);
    }

    public boolean actualizarProveedor(Prove proveedor) {
        return this.pr.actualizar(proveedor);
    }

    public boolean eliminarProveedor(Long id) {
        return this.pr.eliminar(id);
    }

    public Prove obtenerProveedorPorId(Long id) {
        return this.pr.searchById(id);
    }

    public ArrayList<Prove> obtenerProveedores() {
        return this.pr.buscarTodos();
    }

    public ArrayList obtenerProveedoresNombre(String nombre) {
        return pr.searchByName(nombre);
    }
}

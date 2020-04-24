
package negocio;

import java.util.ArrayList;
import java.util.List;
import objetosNegocios.Cliente;
import repositories.ClienteRepo;

/**
 *
 * @author Rayo
 */
public class ConClie {

    private final Control control = new Control();
    private final ClienteRepo clientesR = control.getClienteRepository();

    public void guardarCliente(Cliente cliente) {
        this.clientesR.guardar(cliente);
    }

    public boolean eliminarCliente(Long idCliente) {
        return this.clientesR.eliminar(idCliente);
    }

    public boolean actualizarCliente(Cliente cliente) {
         return this.clientesR.actualizar(cliente);
    }

    public Cliente obtenerClientePorId(Long idCliente) {
        return this.clientesR.searchById(idCliente);
    }

    public ArrayList<Cliente> obtenerClientes() {
        return this.clientesR.buscarTodos();
    }

    public List<Cliente> obtenerClientesComboBox() {
        return this.clientesR.obtenerClientesComboBox();
    }

    public List obtenerClientesNombre(String nombre){
        return clientesR.searchByName(nombre);
    }
}

package negocio;

import java.util.ArrayList;
import objetosNegocios.Categ;
import repositories.CategoriaRepos;

/**
 *
 * @author Rayo
 */
public class ConlCate {
    private final Control control= new Control();
    private final CategoriaRepos cr= control.getCategoriaRepository();
    
    public void guardarCategoria(Categ categoria) {
        this.cr.guardar(categoria);
    }

    public boolean actualizarCategoria(Categ categoria) {
         return this.cr.actualizar(categoria);
    }

    public boolean eliminarCategoria(Long id) {
       return this.cr.eliminar(id);
    }

    public Categ obtenerCategoriaPorId(Long id) {
        return this.cr.searchById(id);
    }

    public ArrayList<Categ> obtenerCategorias()  {
        return this.cr.buscarTodos();
    }

    public ArrayList obtenerCategoriasNombre(String nombre) {
        return this.cr.searchByName(nombre);
    }
}

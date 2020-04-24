package negocio;

import repositories.CategoriaRepos;
import repositories.ClienteRepo;
import repositories.ProductoRelVentaRepo;
import repositories.ProductoRepos;
import repositories.ProveedorRepos;
import repositories.VentasRep;

/**
 *
 * @author Rayo
 */
public class Control {

    private CategoriaRepos categoriaRepository;
    private ClienteRepo clienteRepository;
    private ProductoRelVentaRepo produtoRelVentaRepository;
    private ProductoRepos productoRepository;
    private ProveedorRepos proveedorRepository;
    private VentasRep ventasRepository;
    
    public CategoriaRepos getCategoriaRepository() {
        if (this.categoriaRepository == null) {
            return new CategoriaRepos();
        } else if (this.categoriaRepository != null) {
            return categoriaRepository;
        }
        return null;
    }
    
    public ClienteRepo getClienteRepository() {
        if (this.clienteRepository == null) {
            return new ClienteRepo();
        } else if (this.clienteRepository != null) {
            return clienteRepository;
        }
        return null;
    }
    
    public ProductoRelVentaRepo getProductoRelVentaRepository() {
        if (this.produtoRelVentaRepository == null) {
            return new ProductoRelVentaRepo();
        } else if (this.produtoRelVentaRepository != null) {
            return this.produtoRelVentaRepository;
        }
        return null;
    }
    
    public ProductoRepos getProductoRepository() {
        if (this.productoRepository == null) {
            return new ProductoRepos();
        } else if (this.productoRepository != null) {
            return this.productoRepository;
        }
        return null;
    }
    
    public ProveedorRepos getProveedorRepository() {
        if (this.proveedorRepository == null) {
            return new ProveedorRepos();
        } else if (this.proveedorRepository != null) {
            return this.proveedorRepository;
        }
        return null;
    }
    
    public VentasRep getVentasRepository() {
        if (this.ventasRepository == null) {
            return new VentasRep();
        } else if (this.ventasRepository != null) {
            return this.ventasRepository;
        }
        return null;
    }
    
    
    
    
    
}

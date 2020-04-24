
package objetosNegocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Rayo
 */

@Entity
@Table(name="proveedores")
public class Prove implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproveedor", length = 11)
    private Long id;
    
    @Column(name="rfc",length = 15,nullable = false)
    private String rfc;
    
    @Column(name="nombre",length = 45,nullable = false)
    private String nombre;
   
    @Column(name="direccion", length = 45,nullable = false)
    private String direccion;
    
    @Column(name="telefono",length = 20,nullable = true)
    private String telefono;
    
    @Column(name="paginaweb",length = 500,nullable = true)
    private String paginaweb;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "proveedor")
    private List<Producto> productos;
 
    public Prove() {
        productos = new ArrayList<>();
    }

    public Prove(String rfc, String nombre, String direccion, String telefono, String paginaweb) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaweb = paginaweb;
    }
    
    public Prove(String rfc, String nombre, String direccion, String telefono, String paginaweb, List<Producto> productos) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaweb = paginaweb;
        this.productos = productos;
    } 
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRfc() {
        return rfc;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPaginaweb() {
        return paginaweb;
    }

    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }
     @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prove)) {
            return false;
        }
        Prove other = (Prove) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

        public Object[] toArray() {
        return new Object[]{
            this.getId(),
            this.getRfc(),
            this.getNombre(),
            this.getDireccion(),
            this.getTelefono(),
            this.getPaginaweb()
        };
    }

    @Override
    public String toString() {
        return  id + " (" + nombre + ")";
    }

     
         
        
    
}

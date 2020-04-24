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
@Table(name="clientes")
public class Cliente implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcliente",length = 11)
    private Long id;
    @Column(name="rfc",length = 15,nullable = false)
    private String rfc;
    @Column(name="nombre",length = 45,nullable = false)
    private String nombre;
    @Column(name="direccion",length = 100,nullable = false)
    private String direccion;
    @Column(name="telefono1",length = 15, nullable = true)
    private String telefono1;
    @Column(name="telefono2",length = 15,nullable = true)
    private String telefono2;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cliente")
    private List<Venta> ventas;

    public Cliente() {
        ventas= new ArrayList<>();
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
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

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + "(" + nombre + ")";
    }

     

    public Object[] toArray(){
        return new Object[]{
            this.getId(),
            this.getNombre(),
            this.getRfc(),
            this.getDireccion(),
            this.getTelefono1(),
            this.getTelefono2()
        };
    }
    
}

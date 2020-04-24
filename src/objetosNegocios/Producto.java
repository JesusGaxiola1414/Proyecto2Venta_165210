
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Rayo
 */
@Entity
@Table(name="productos")
public class Producto implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproducto", length = 11)
    private Long id;
    @Column(name="nombre",nullable = false,length = 100)
    private String nombre;
    @Column(name="precioactual",nullable = false)
    private Float precioActual;
    @Column(name="stock",nullable = false,length = 11)
    private Integer stock;

    @ManyToOne(optional = false, targetEntity = Prove.class)
    @JoinColumn(name="idproveedor")
    private Prove proveedor;
    
    @ManyToOne(optional = false,targetEntity = Categ.class)
    @JoinColumn(name="idcategoria")
    private Categ categoria;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "producto")
    private List<ProduVenta> ventas;
    
    public Producto() {
        ventas= new ArrayList<>();
    }

    public Producto(String nombre, Float precioActual, Integer stock, Prove proveedor, Categ categoria) {
        this();
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
        this.proveedor = proveedor;
        this.categoria = categoria;
    }
    
    public Producto(String nombre, Float precioActual, Integer stock, Prove proveedor, Categ categoria, List<ProduVenta> ventas) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.ventas = ventas;
    }

    
    
    public void addVenta(ProduVenta venta) {
        venta.setProducto(this);
        this.ventas.add(venta);
    }
    
    public Prove getProveedor() {
        return proveedor;
    }

    public void setProveedor(Prove proveedor) {
        this.proveedor = proveedor;
    }

    public Categ getCategoria() {
        return categoria;
    }

    public void setCategoria(Categ categoria) {
        this.categoria = categoria;
    }

    public List<ProduVenta> getVentas() {
        return ventas;
    }

    public void setVentas(List<ProduVenta> ventas) {
        this.ventas = ventas;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(Float precioActual) {
        this.precioActual = precioActual;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precioActual=" + precioActual + ", stock=" + stock + '}';
    }

     public Object[] toArray() {
        return new Object[]{
            this.getId(),
            this.getNombre(),
            this.getPrecioActual(),
            this.getStock(),
            this.getCategoria().getNombre(),
            this.getProveedor().getNombre()
        };
    }

    public Object[] toArrayProductosExistentes() {
        return new Object[]{
            this.getId(),
            this.getNombre(),
            this.getPrecioActual(),
            this.getStock()
        };
    }
    
}

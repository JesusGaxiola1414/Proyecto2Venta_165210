package objetosNegocios;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Rayo
 */
@Entity
@Table(name = "rel_productoventa")
public class ProduVenta implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrel_productoventa", length = 11)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idproducto", nullable = false)
    private Producto producto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idventa", nullable = false)
    private Venta venta;

    @Column(name = "precio", nullable = false)
    private Float precio;

    @Column(name = "cantidad", length = 11,nullable = false)
    private Integer cantidad;

    @Column(name = "montototal", nullable = false)
    private Float montoTotal;

    public ProduVenta() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
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
        if (!(object instanceof ProduVenta)) {
            return false;
        }
        ProduVenta other = (ProduVenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public Object[] toArray() {
        return new Object[]{
            this.getProducto().getId(),
            this.getProducto().getNombre(),
            this.getPrecio(),
            this.getCantidad(),
            this.getMontoTotal()
        };
    }

    @Override
    public String toString() {
        return "ProductoRelVenta{" + "id=" + id + ", producto=" + producto + ", venta=" + venta + ", precio=" + precio + ", cantidad=" + cantidad + ", montoTotal=" + montoTotal + '}';
    }

}

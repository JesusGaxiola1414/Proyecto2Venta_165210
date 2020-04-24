package objetosNegocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Rayo
 */
@Entity
@Table(name="ventas")
public class Venta implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idventa",length = 11)
    private Long id;
    
    @Column(name="fecha",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @ManyToOne(optional = false)
    @JoinColumn(name="idcliente")
    private Cliente cliente;
    
    @Column(name="descuento",nullable = false)
    private Float descuento;
    
    @Column(name="montofinal",nullable = false)
    private Float montoFinal;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "venta")
    private List<ProduVenta> productos;

    public Venta() {
        productos= new ArrayList<>();
    }

    public List<ProduVenta> getProductos() {
        return productos;
    }
    public void agregarProducto(ProduVenta p){
        productos.add(p);
    }
    public void setProductos(List<ProduVenta> productos) {
        this.productos = productos;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public Float getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(Float montoFinal) {
        this.montoFinal = montoFinal;
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
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", fecha=" + fecha + ", cliente=" + cliente + ", descuento=" + descuento + ", montoFinal=" + montoFinal + '}';
    }

     public Object[] toArray() {
        Float subtotal = 0F;
        for (ProduVenta producto : productos) {
            subtotal += producto.getMontoTotal();
        }
        return new Object[]{
            this.getId(),
            this.getCliente(),
            this.getFecha().toLocaleString(),
            subtotal,
            this.getDescuento(),
            this.getMontoFinal()
        };
    
     } 
}

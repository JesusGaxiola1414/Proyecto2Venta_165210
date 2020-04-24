package repositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import objetosNegocios.Cliente;
import objetosNegocios.Venta;

/**
 *
 * @author Rayo
 */
public class VentasRep extends BaseRep<Venta> {

    @Override
    public void guardar(Venta entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean eliminar(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta vTemp = entityManager.find(Venta.class, id);
        if (vTemp != null) {
            entityManager.remove(vTemp);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public boolean actualizar(Venta entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta vTemp = entityManager.find(Venta.class, entidad.getId());
        if (vTemp != null) {
            vTemp.setCliente(entidad.getCliente());
            vTemp.setDescuento(entidad.getDescuento());
            vTemp.setFecha(entidad.getFecha());
            vTemp.setMontoFinal(entidad.getMontoFinal());
            entityManager.merge(vTemp);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public Venta searchById(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta vTemp = entityManager.find(Venta.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return vTemp;
    }

    @Override
    public ArrayList<Venta> searchByName(String nombre) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Venta> criteriaQuery = builder.createQuery(Venta.class);
        //Consulta
        Root<Venta> root = criteriaQuery.from(Venta.class);
        criteriaQuery = criteriaQuery.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<Venta> query = entityManager.createQuery(criteriaQuery);
        ArrayList<Venta> ventas = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return ventas;
    }

    @Override
    public ArrayList<Venta> buscarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteriaQuery = entityManager.getCriteriaBuilder().createQuery();
        criteriaQuery.select(criteriaQuery.from(Venta.class));
        Query query = entityManager.createQuery(criteriaQuery);
        ArrayList<Venta> ventas = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return ventas;

    }

    public List<Venta> obtenerVentasPorCliente(Date inicio, Date fin, Cliente cliente) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        List<Venta> ventas = null;
        if (cliente == null) {
            String jpqlQuery = "SELECT v FROM Venta v WHERE v.fecha BETWEEN :inicio AND :fin";
            TypedQuery<Venta> query = entityManager.createQuery(jpqlQuery, Venta.class);
            query.setParameter("inicio", inicio, TemporalType.TIMESTAMP);
            query.setParameter("fin", fin, TemporalType.TIMESTAMP);
            ventas = query.getResultList();
        } else {
            String jpqlQuery = "SELECT v FROM Venta v WHERE v.fecha BETWEEN :inicio AND :fin AND v.cliente = :cliente";
            TypedQuery<Venta> query = entityManager.createQuery(jpqlQuery, Venta.class);
            query.setParameter("inicio", inicio, TemporalType.TIMESTAMP);
            query.setParameter("fin", fin, TemporalType.TIMESTAMP);
            query.setParameter("cliente", cliente);
            ventas = query.getResultList();
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return ventas;
    }

}

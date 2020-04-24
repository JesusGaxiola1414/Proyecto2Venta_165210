
package repositories;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import objetosNegocios.ProduVenta;

/**
 *
 * @author Rayo
 */
public class ProductoRelVentaRepo extends BaseRep<ProduVenta> {

    @Override
    public void guardar(ProduVenta entidad) {
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
        ProduVenta prvTemp = entityManager.find(ProduVenta.class, id);
        if (prvTemp != null) {
            entityManager.remove(prvTemp);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public boolean actualizar(ProduVenta entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        ProduVenta prvTemp = entityManager.find(ProduVenta.class, entidad.getId());
        if (prvTemp != null) {
            prvTemp.setCantidad(entidad.getCantidad());
            prvTemp.setMontoTotal(entidad.getMontoTotal());
            prvTemp.setPrecio(entidad.getPrecio());
            prvTemp.setProducto(entidad.getProducto());
            prvTemp.setVenta(entidad.getVenta());
            entityManager.merge(prvTemp);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public ProduVenta searchById(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        ProduVenta prvTemp = entityManager.find(ProduVenta.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return prvTemp;
    }

    @Override
    public ArrayList<ProduVenta> searchByName(String nombre) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ProduVenta> criteriaQuery = builder.createQuery(ProduVenta.class);
        Root<ProduVenta> root = criteriaQuery.from(ProduVenta.class);
        criteriaQuery = criteriaQuery.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<ProduVenta> query = entityManager.createQuery(criteriaQuery);
        ArrayList<ProduVenta> productosVentas = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return productosVentas;

    }

    @Override
    public ArrayList<ProduVenta> buscarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteriaQuery = entityManager.getCriteriaBuilder().createQuery();
        criteriaQuery.select(criteriaQuery.from(ProduVenta.class));
        Query query = entityManager.createQuery(criteriaQuery);
        ArrayList<ProduVenta> productosVentas = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return productosVentas;

    }

}


package repositories;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import objetosNegocios.Producto;

/**
 *
 * @author Rayo
 */
public class ProductoRepos extends BaseRep<Producto> {

    @Override
    public void guardar(Producto entidad) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public boolean eliminar(Long id) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        Producto pTemp = em.find(Producto.class, id);
        if (pTemp != null) {
            em.remove(pTemp);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        em.getTransaction().commit();
        em.close();
        return false;
    }

    @Override
    public boolean actualizar(Producto entidad) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        Producto pTemp = em.find(Producto.class, entidad.getId());
        if (pTemp != null) {
            pTemp.setNombre(entidad.getNombre());
            pTemp.setCategoria(entidad.getCategoria());
            pTemp.setPrecioActual(entidad.getPrecioActual());
            pTemp.setStock(entidad.getStock());
            pTemp.setProveedor(entidad.getProveedor());
            em.merge(pTemp);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        em.getTransaction().commit();
        em.close();
        return false;
    }

    @Override
    public Producto searchById(Long id) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        Producto pTemp = em.find(Producto.class, id);
        em.getTransaction().commit();
        em.close();
        return pTemp;
    }

    @Override
    public ArrayList<Producto> searchByName(String nombre) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Producto> cq = builder.createQuery(Producto.class);
        Root<Producto> root = cq.from(Producto.class);
        cq = cq.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<Producto> typedQuery = em.createQuery(cq);
        ArrayList<Producto> productos = new ArrayList<>(typedQuery.getResultList());
        em.getTransaction().commit();
        em.close();
        return productos;
    }

    @Override
    public ArrayList<Producto> buscarTodos() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Producto.class));
        Query query = em.createQuery(cq);
        ArrayList<Producto> productos = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return productos;
    }

    public void actualizarStock(Producto producto) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Producto productoActualizado = entityManager.find(Producto.class, producto.getId());
        if (productoActualizado != null) {
            productoActualizado.setStock(producto.getStock());
            entityManager.merge(productoActualizado);
            entityManager.getTransaction().commit();
        }
    }

}

package repositories;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import objetosNegocios.Categ;

/**
 *
 * @author Rayo
 */
public class CategoriaRepos extends BaseRep<Categ> {

    @Override
    public void guardar(Categ entidad) {
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
        Categ cTemp = em.find(Categ.class, id);
        if (cTemp != null) {
            em.remove(cTemp);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        em.getTransaction().commit();
        em.close();
        return false;
    }

    @Override
    public boolean actualizar(Categ entidad) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        Categ cTemp = em.find(Categ.class, entidad.getId());
        if (cTemp != null) {
            cTemp.setDescripcion(entidad.getDescripcion());
            cTemp.setNombre(entidad.getNombre());
            em.merge(cTemp);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        em.getTransaction().commit();
        em.close();
        return false;
    }

    @Override
    public Categ searchById(Long id) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        Categ cTemp = em.find(Categ.class, id);
        em.getTransaction().commit();
        em.close();
        return cTemp;
    }

    @Override
    public ArrayList<Categ> searchByName(String nombre) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Categ> cq = builder.createQuery(Categ.class);
        Root<Categ> root = cq.from(Categ.class);
        cq = cq.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<Categ> typedQuery = em.createQuery(cq);
        ArrayList<Categ> categorias = new ArrayList<>(typedQuery.getResultList());
        em.getTransaction().commit();
        em.close();
        return categorias;
    }

    @Override
    public ArrayList<Categ> buscarTodos() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Categ.class));
        Query query = em.createQuery(cq);
        ArrayList<Categ> categorias = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return categorias;
    }

}

package repositories;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import objetosNegocios.Prove;

/**
 *
 * @author Rayo
 */
public class ProveedorRepos extends BaseRep<Prove> {

    @Override
    public void guardar(Prove entidad) {
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
        Prove pTemp = entityManager.find(Prove.class, id);
        if (pTemp != null) {
            entityManager.remove(pTemp);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public boolean actualizar(Prove entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Prove pTemp = entityManager.find(Prove.class, entidad.getId());
        if (pTemp != null) {
            pTemp.setDireccion(entidad.getDireccion());
            pTemp.setNombre(entidad.getNombre());
            pTemp.setPaginaweb(entidad.getPaginaweb());
            pTemp.setRfc(entidad.getRfc());
            pTemp.setTelefono(entidad.getTelefono());
            entityManager.merge(pTemp);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public Prove searchById(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Prove pTemp = entityManager.find(Prove.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return pTemp;
    }

    @Override
    public ArrayList<Prove> buscarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteriaQuery = entityManager.getCriteriaBuilder().createQuery();
        criteriaQuery.select(criteriaQuery.from(Prove.class));
        Query query = entityManager.createQuery(criteriaQuery);
        ArrayList<Prove> proveedores = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return proveedores;
    }

    @Override
    public ArrayList<Prove> searchByName(String nombre) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Prove> criteriaQuery = builder.createQuery(Prove.class);
        //Consulta
        Root<Prove> root = criteriaQuery.from(Prove.class);
        criteriaQuery = criteriaQuery.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<Prove> query = entityManager.createQuery(criteriaQuery);
        ArrayList<Prove> proveedores = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return proveedores;
    }

}

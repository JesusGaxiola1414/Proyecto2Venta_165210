package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import objetosNegocios.Cliente;

/**
 *
 * @author Rayo
 */
public class ClienteRepo extends BaseRep<Cliente> {

    @Override
    public void guardar(Cliente entidad) {
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
        Cliente cTemp = entityManager.find(Cliente.class, id);
        if (cTemp != null) {
            entityManager.remove(cTemp);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public boolean actualizar(Cliente entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cTemp = entityManager.find(Cliente.class, entidad.getId());
        if (cTemp != null) {
            cTemp.setDireccion(entidad.getDireccion());
            cTemp.setNombre(entidad.getNombre());
            cTemp.setRfc(entidad.getRfc());
            cTemp.setTelefono1(entidad.getTelefono1());
            cTemp.setTelefono2(entidad.getTelefono2());
            entityManager.merge(cTemp);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public Cliente searchById(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cTemp = entityManager.find(Cliente.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return cTemp;
    }

    @Override
    public ArrayList<Cliente> searchByName(String nombre) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Cliente> criteriaQuery = builder.createQuery(Cliente.class);
        Root<Cliente> root = criteriaQuery.from(Cliente.class);
        criteriaQuery = criteriaQuery.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<Cliente> query = entityManager.createQuery(criteriaQuery);
        ArrayList<Cliente> clientes = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return clientes;

    }

    @Override
    public ArrayList<Cliente> buscarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteriaQuery = entityManager.getCriteriaBuilder().createQuery();
        criteriaQuery.select(criteriaQuery.from(Cliente.class));
        Query query = entityManager.createQuery(criteriaQuery);
        ArrayList<Cliente> clientes = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return clientes;
    }

    public List<Cliente> obtenerClientesComboBox() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Cliente.class));
        Query query = entityManager.createQuery(criteria);
        List<Cliente> clientes = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return clientes;
    }
}

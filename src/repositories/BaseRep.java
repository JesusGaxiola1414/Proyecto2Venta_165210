package repositories;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Rayo
 */
public abstract class BaseRep <T> {
    
    public abstract void guardar(T entidad);
    public abstract boolean eliminar(Long id);
    public abstract boolean actualizar(T entidad);
    public abstract T searchById(Long id);
    public abstract ArrayList<T> searchByName(String nombre);
    public abstract ArrayList<T> buscarTodos();
    
    public EntityManager createEntityManager(){
        EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("Proyecto2_puntoVenta_189029PU");
        EntityManager em= emFactory.createEntityManager();
        return em;
    }
}

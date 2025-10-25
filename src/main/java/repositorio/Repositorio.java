package repositorio;

import javax.jdo.*;
import javax.jdo.JDOHelper;

public class Repositorio<T> implements IRepositorio<T> {

    private final PersistenceManagerFactory pmf;

    public Repositorio(String persistenceUnit) {
        // Debe coincidir con el name del persistence.xml (por ej. "mysql")
        this.pmf = JDOHelper.getPersistenceManagerFactory(persistenceUnit);
    }

    @Override
    public void guardar(T entity) {
        PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx = pm.currentTransaction();
        try {
            tx.begin();
            pm.makePersistent(entity);
            tx.commit(); // <- SIN ESTO NO SE GUARDA
            System.out.println("Guardado OK: " + entity);
        } catch (RuntimeException e) {
            if (tx.isActive()) tx.rollback();
            throw e;
        } finally {
            pm.close();
        }
    }


    @Override
    public T consultar(Class clase, int id) {
        PersistenceManager pm = pmf.getPersistenceManager();        
        return (T) pm.getObjectById(clase, id);
    }

}

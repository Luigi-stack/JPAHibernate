package dao;



import javax.persistence.EntityManager;



import model.Persona;
import utils.JpaUtils;

public abstract class PersonaDAO implements IPersonaDAO {

	@Override
	public void save(Persona ev) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(ev);
			em.getTransaction().commit();
			System.out.println("Evento salvato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}
	}
}

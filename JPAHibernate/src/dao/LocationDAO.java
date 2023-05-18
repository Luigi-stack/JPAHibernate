package dao;

import javax.persistence.EntityManager;

import model.Location;
import utils.JpaUtils;

public abstract class LocationDAO implements ILocationDAO {

	@Override
	public void save(Location ev) {
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

package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Evento;
import utils.TipoEvento;



public class MainProject {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		Evento e1 = new Evento("Party casa Luigi", LocalDate.of(2022, 8, 11), TipoEvento.PUBBLICO, 34, null, null );
//		Evento e2 = new Evento("Piscina", LocalDate.of(2022, 9, 15), TipoEvento.PUBBLICO, 15 );
//		Evento e3 = new Evento("Schiuma Party", LocalDate.of(2022, 7, 7), TipoEvento.PRIVATO, 25 );
//		inserisciEvento(e1);
//		inserisciEvento(e2);
//		inserisciEvento(e3);
		
		
		
		
// per modificare o eliminare un evento, prima bisogna leggerlo!
//		Evento e = leggiEvento(2);
//		System.out.println(e);
//		
//		e.setTitolo("Concerto Ligabue");
//		modificaEvento(e);

//		eliminaEvento(e);
		

	}
	
//	
//	public static void inserisciEvento (Evento e) {
//		em.getTransaction().begin();
//		em.persist(e);
//		em.getTransaction().commit();
//	}
//	
//	public static void modificaEvento (Evento e) {
//		em.getTransaction().begin();
//		em.merge(e);
//		em.getTransaction().commit();
//		
//	}
//	
//	public static void eliminaEvento (Evento e) {
//		em.getTransaction().begin();
//		em.remove(e);
//		em.getTransaction().commit();
//		
//	}
//	
//	
//	public static Evento leggiEvento (Integer id) {
//		em.getTransaction().begin();
//		Evento e = em.find(Evento.class, id);
//		em.getTransaction().commit();
//		
//		return e;
//	}



}

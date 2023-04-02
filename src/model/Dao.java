package model;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

//import Libro;
//import Elemento;
import utils.JpaUtil;

public class Dao {

	public static void save(Elemento item) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();

			em.persist(item);

			transaction.commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();

			System.out.println("Errore di salvataggio: " + item.getClass().getSimpleName());
			System.out.println(ex);
			throw ex;
		}
	}

	public static Elemento getById(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			return em.find(Elemento.class, id);

		} finally {
			em.close();
		}
	}

	public static void delete(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();

			Query queryDelete;
			if (getById(id) instanceof Libro) {
				queryDelete = em.createQuery("DELETE Book b WHERE b.isbn =" + id);
			} else {
				queryDelete = em.createQuery("DELETE Magazine m WHERE m.isbn =" + id);
			}
			queryDelete.executeUpdate();
			em.getTransaction().commit();

		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Errore di cancellazione, riprovare");
			throw ex;
		} finally {
			em.close();
		}
	}
}
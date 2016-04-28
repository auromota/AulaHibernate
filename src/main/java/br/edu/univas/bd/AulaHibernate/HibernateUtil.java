package br.edu.univas.bd.AulaHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	private static final EntityManagerFactory emFactory = buildSessionFactory();

	private static EntityManagerFactory buildSessionFactory() {
		try {
			return Persistence.createEntityManagerFactory("PersistenceUnit");
		} catch (Throwable e) {
			System.err.println("Error creating EntityManagerFactory." + e);
			throw new ExceptionInInitializerError(e);
		}
	}

	public static EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}
}

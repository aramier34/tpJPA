package diginamic_jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnectionJpa {
	private static EntityManagerFactory sessionFactory;
	
	protected static void setUp() {
		sessionFactory = Persistence.createEntityManagerFactory("my-persistence-unit");
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		EntityManager em = sessionFactory.createEntityManager();

		System.out.println("R�sultat fonction isOpen de EntityManager " + em.isOpen());
        em.close();
        System.out.println("R�sultat fonction isOpen de EntityManager " + em.isOpen());
	}

}

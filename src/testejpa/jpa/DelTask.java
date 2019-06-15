package testejpa.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import testejpa.modelo.Task;

public class DelTask {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tasks2");		
		EntityManager manager = factory.createEntityManager();
		
		Task resulttask = manager.find(Task.class, 1L);
		
		manager.getTransaction().begin();
		manager.remove(resulttask);
		manager.getTransaction().commit();
	
		System.out.println("Teste del com JPA!");
		System.out.println("Id da Task excluida: " + resulttask.getId());
		
		manager.close();

	}
}

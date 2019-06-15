package testejpa.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import testejpa.modelo.Task;

public class FindTask {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tasks2");		
		EntityManager manager = factory.createEntityManager();
		
		Task resulttask = manager.find(Task.class, 1L);
		
		System.out.println("Testando JPA e Hibernate!");
		System.out.println("Id e descrição da Task pesquisada: " + resulttask.getId() + " - " + resulttask.getDescricao());
		
		manager.close();

	}
}

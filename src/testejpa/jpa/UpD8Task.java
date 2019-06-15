package testejpa.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import testejpa.modelo.Task;

public class UpD8Task {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tasks2");		
		EntityManager manager = factory.createEntityManager();
		
		Task task = manager.find(Task.class, 2L);
		
		task.setDescricao("Estudar muito mais JPA!");
		task.setFinalizada(false);
		task.setDataFinalizacao(null);
		
		manager.getTransaction().begin();
		manager.merge(task);
		manager.getTransaction().commit();
	
		System.out.println("Teste Upd8 com JPA e Hibern8!");
		System.out.println("Id da Task alterada: " + task.getId());
		
		manager.close();

	}
}

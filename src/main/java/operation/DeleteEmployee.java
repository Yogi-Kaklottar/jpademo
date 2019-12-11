package operation;
import demo.Employee;
import javax.persistence.*;
public class DeleteEmployee {
	  
	 public static void main(String[] args)
	 {
		 
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
		 EntityManager em=emf.createEntityManager();
		 em.getTransaction().begin();
		 Employee e=em.find(Employee.class,3);
		 em.remove(e);
		 em.getTransaction().commit();
		 em.close();
		 emf.close();
		 
		 
	 }

}

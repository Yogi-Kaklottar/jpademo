package operation;
import demo.Employee;
import javax.persistence.*;


public class UpdateEmployee {
	
	
	public static void main(String[] args)
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
	    Employee e=em.find(Employee.class,2);
	  //  System.out.println(e);
	    e.setEname("vishal");
	    e.setDeg("sales");
	    e.setSalary(20000);
	    em.persist(e);
	    em.getTransaction().commit();
	 //   System.out.println(e);
	    em.close();
	    emf.close();
	    
	}

}

package operation;
import javax.persistence.*;
import demo.Employee;

public class SelectEmployee {
	 
	public static void main(String[] args)
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
		EntityManager em=emf.createEntityManager();
		Employee e=em.find(Employee.class,4);
	   System.out.println(e);
	     em.close();
	     emf.close();
		
	}

}

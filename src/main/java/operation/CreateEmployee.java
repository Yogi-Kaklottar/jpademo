package operation;
import demo.Employee;


import javax.persistence.*;
public class CreateEmployee {
		public static void main(String[] args)
		{
			EntityManagerFactory creEmp=Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
			
			EntityManager em=creEmp.createEntityManager();
			
			em.getTransaction().begin();
				Employee e=new Employee();
				e.setEname("yogendra");
				e.setSalary(15000);
				e.setDeg("manager");
				
			em.persist(e);
			em.getTransaction().commit();
			em.close();
			creEmp.close();
			
			
		}
	

}

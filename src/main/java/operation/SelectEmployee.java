package operation;
import java.util.List;

import javax.persistence.*;
import demo.Employee;
public class SelectEmployee {
	 
	public static void main(String[] args)
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
		EntityManager em=emf.createEntityManager();
		//simple find one record
		System.out.println("-------------select single record-------------");
		Employee e=em.find(Employee.class,4);
	    System.out.println(e);
	    
	    //select mutiple record;
	   	    Query allData=em.createQuery("select e from Employee e");
	    
	    List<Employee> a=(List<Employee>)allData.getResultList();
	    System.out.println("-------------select multipale record-------------");

	    for (Employee employee : a) {
			System.out.println(employee.getEid());
			System.out.print("       "+employee.getEname());
			System.out.print("       "+employee.getDeg());
			System.out.print("        "+employee.getSalary());
		}
	     
		
	     
	     
	     //select perticular Column
	    
	     
	     Query singleCo=em.createQuery("select e.ename from Employee e");
	     System.out.println("-------------select column-------------");
	     List<String>s=(List<String>)singleCo.getResultList();
	     for (String p : s) {
			System.out.println(p);
		}
	     
	     
	     
	     //select data fro order by salry
	     Query ord=em.createQuery("select e.ename from Employee e ORDER BY salary");
	     System.out.println("-------------select Order wise-------------");
	     List<String>k=(List<String>)ord.getResultList();
	     for (String p : k) {
			System.out.println(p);
		}
	    em.close();
	     emf.close();
	}

}

package demo;

import javax.persistence.*;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ename;
	private int salary;
	private String deg;

	public Employee(long eid, String ename, int salary, String deg) {
		super();
		this.id = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEid() {
		return id;
	}

	public void setEid(long eid) {
		this.id = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + id + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + ", getEid()="
				+ getEid() + ", getEname()=" + getEname() + ", getSalary()=" + getSalary() + ", getDeg()=" + getDeg()
				+ "]";
	}
}
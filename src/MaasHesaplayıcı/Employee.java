package MaasHesaplayýcý;

public class Employee {

	private String name;
	private double salary;
	private double workHours;
	private int hireHire;
	
	public Employee() {
		
	}
	public Employee(String name, double salary, double workHours, int hireHire) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireHire = hireHire;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getWorkHours() {
		return workHours;
	}
	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}
	public int getHireHire() {
		return hireHire;
	}
	public void setHireHire(int hireHire) {
		this.hireHire = hireHire;
	}
	
	
}

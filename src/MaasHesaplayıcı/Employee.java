package MaasHesaplayıcı;

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
	
	public int tax () {
		int tax;
		if(this.salary <1000) {
			System.out.println("vergi uygulanmadý");
			tax=0;
		}else {
			tax=(int) (this.salary*0.03);
			
		}
		return tax;
		
		
	}
 public int bonus() {
     return (int) (this.workHours*0.30);
 }
 
 public int  raiseSalary(){
     int tmp = 2021 - this.hireHire;
   int zam = 0;
     if (tmp < 10) {
         zam = (int) (this.salary * 0.05);
     }else if(tmp > 9 && tmp < 20){
         zam = (int) (this.salary * 0.10);
     }else if(tmp > 19){
         zam = (int) (this.salary * 0.15);
     }
     return zam;
 }
	
	public String toString() {
		
		return "Adı : "+this.name+" "+"Çalışanın maaşı : "+this.salary+" "+"haftlalık çalışma saati : "+this.workHours+" "+"işe başlangıç yılı :  "+this.hireHire;
		
	}
	
	
	

}
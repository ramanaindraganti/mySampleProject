package learning.employeelist;

public class Employee implements Comparable<Employee> {
	
	private Integer empId;
	
	private String empName;
	
	private Double empSal;

	public Employee(int empId, String empName, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	public Employee(){
		
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	@Override
	public int compareTo(Employee o) {
		if(this==o){
			return 0;
		}
		
		if(this!=null && o!=null &&  this.getEmpId()!=null && o.getEmpId()!=null) {
			return this.getEmpId().compareTo(o.getEmpId());
		}
		return 0;
	}
	
	
	public String toString(){
		return "Empid: "+ this.empId + "Emp Name :" + this.empName + "Emp Sal:" + this.empSal;
		
	}

}

package learning.employeelist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeUtility {

	private List<Employee> empList = new ArrayList<Employee>();
	
	public boolean addEmployee(Employee emp){
		empList.add(emp);
		return true;
	}
	
	public List<Employee> getAllEmployees(){
		return empList;
	}
	
	public List<Employee> sortEmployeeById(){
		
		List<Employee> tempList = new ArrayList<Employee>();
		tempList.addAll(empList);
		Collections.sort(tempList);
		return tempList;
	}
	
	public List<Employee> sortEmployeeBySal(){
		List<Employee> tempList = new ArrayList<Employee>();
		tempList.addAll(empList);
		Collections.sort(tempList,new EmployeeSalarySorter());
		return tempList;
	}
	
	public boolean deleteEmployee(int empId){
		Employee e = searchByEmpId(empId);
		if(e!=null){
		empList.remove(e);
		return true;
		}
		
		return false;
	}

	public Employee searchByEmpId(int empId) {
		for(Employee emp : empList){
			if(emp.getEmpId()==empId){
				return emp;
			}
		}
		return null;
	}
	
	public void display(){
		for(Employee e : empList){
			System.out.println(e);
		}
	}
	
}

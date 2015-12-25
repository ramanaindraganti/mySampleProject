package learning.employeelist;

import java.util.List;

public class EmployeeUtilityTest {

	public static void main(String[] args) {
		
		EmployeeUtility empUtil = new EmployeeUtility();
		Employee e = new Employee();
		e.setEmpId(1002);
		e.setEmpName("John");
		e.setEmpSal(1000.0);
		
		empUtil.addEmployee(e);
		
		Employee e1 = new Employee(1000,"david",2435.0);
		empUtil.addEmployee(e1);
		
		Employee e2 = new Employee(1001,"chris",24235.0);
		empUtil.addEmployee(e2);
		
		empUtil.display();
		
		List<Employee> sortedList = empUtil.sortEmployeeById();
		
		System.out.println("Sorted employee List");
		for(Employee emp : sortedList){
			System.out.println(emp);
		}
		
		System.out.println("Sorted employee List by salary");
		List<Employee> sortedListSal = empUtil.sortEmployeeBySal();
		for(Employee emp : sortedListSal){
			System.out.println(emp);
		}
	}

}

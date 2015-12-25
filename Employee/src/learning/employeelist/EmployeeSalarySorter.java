package learning.employeelist;

import java.util.Comparator;

public class EmployeeSalarySorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1==o2){
			return 0;
		}
		
		if(o1!=null && o2!=null &&  o1.getEmpSal()!=null && o2.getEmpSal()!=null) {
			return o2.getEmpSal().compareTo(o1.getEmpSal());
		}
		return 0;
	}

}

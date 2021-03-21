package Employee;

import java.util.Comparator;

/**
 * this class Natural Sort the id 
 * @author yash.porwal_metacube
 *
 */
public class NaturalSort implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.emp_id - e2.emp_id;
	}
	
}
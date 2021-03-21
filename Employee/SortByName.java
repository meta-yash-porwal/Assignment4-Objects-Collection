package Employee;

import java.util.Comparator;

/**
 * this class is used to Sort the Employee by name
 * @author yash.porwal_metacube
 *
 */
public class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.emp_name.compareTo(e2.emp_name);
	}
	
}
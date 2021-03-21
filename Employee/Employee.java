package Employee;

/**
 * class to store employee details 
 * @author yash.porwal_metacube
 *
 */
public class Employee {
	int emp_id;
	String emp_name;
	String address;
	
	/**
	 * constructor to store values in the current object
	 * @param emp_id as an integer
	 * @param emp_name as a String
	 * @param address as a String
	 */
	public Employee(int emp_id, String emp_name, String address) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.address = address;
	}

}
package Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Main Class
 * @author yash.porwal_metacube
 *
 */
public class Main {
	static int id = 1;
	/**
	 * Collection of Employee class in ArrayList - employeeList
	 */
	static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		boolean flag=true;
		while(flag) {
			System.out.println("1. to add employee "
					+ "\n2. Natural sort on basis of Employee Id "
					+ "\n3. Sort on basis of name "
					+ "\n4. Display the list \n5. Exit");
			System.out.print("Enter choice:-  ");
			choice=sc.nextInt();
			System.out.println("\n");
			switch(choice) {
			case 1:
				String name, add;
				System.out.print("Enter the name of employee:- ");
				name = sc.next();
				sc.nextLine();
				System.out.print("Enter the address of employee:- ");
				add = sc.nextLine();
				Employee e = new Employee(id++, name, add);
				employeeList.add(e);
				break;
				
			case 2:
				// Natural Order Sorting on empId basis
				Collections.sort(employeeList, new NaturalSort());
				showEmployeeList();
				break;
				
			case 3:
//				Ascending Order Sorting by Employee Name
				Collections.sort(employeeList, new SortByName());
				showEmployeeList();
				break;
				
			case 4:
				showEmployeeList();
				break;
				
			case 5:
				flag=false;
				break;
				
			default:
				System.out.println("Invalid input");
			}
			
			System.out.println("\n\n");
		}
	}
	
	/**
	 * method to show all employee details complete list
	 */
	static void showEmployeeList() {
		System.out.println("The employee list is as follows Employee List");
		System.out.println("\nEmpId\t\tEmployeeName\t\tAddress");
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println("\n" + employeeList.get(i).emp_id
					+"\t\t"+employeeList.get(i).emp_name
					+"\t\t\t"+employeeList.get(i).address);
		}
	}
}
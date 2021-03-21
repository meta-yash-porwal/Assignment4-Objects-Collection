package Chemistry;

import java.util.Scanner;
import java.util.Stack;

/**
 * this class calculate molecular mass of compounds that 
 * include C(Carbon)-12, O(Oxygen)-16, H(Hydrogen)-1.
 * @author yash.porwal_metacube
 *
 */
public class OrganicChemistry {

	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String compound;
		System.out.println("Enter the organic compound:- ");
		compound = sc.next();
		int result = evaluate(compound);
		System.out.println("Molecular mass of "+ compound +" is "+ result);

	}
	
	/**
	 * this method evaluate the molecular mass of a compound
	 * Using Stack collection
	 * @param compound String as an Input
	 * @return the molecular mass of that compound
	 */
	private static int evaluate(String compound) {
		int sum = 0, i;
		for(i = 0; i<compound.length(); i++) {
			char c= compound.charAt(i);
			switch(c) {
				case 'C':
					stack.push(12);
					break;
				case 'O':
					stack.push(16);
					break;
				case 'H':
					stack.push(1);
					break;
				case '2':
					stack.push(stack.pop()*2);
					break;
				case '3':
					stack.push(stack.pop()*3);
					break;
				case '4':
					stack.push(stack.pop()*4);
					break;
				case '5':
					stack.push(stack.pop()*5);
					break;
				case '6':
					stack.push(stack.pop()*6);
					break;
				case '7':
					stack.push(stack.pop()*7);
					break;
				case '8':
					stack.push(stack.pop()*8);
					break;
				case '9':
					stack.push(stack.pop()*9);
					break;
				case '(':
					stack.push(0);
					break;
				case ')':
					int s=0;
					while(stack.peek() != 0) {
						s+=stack.pop();
					}
					stack.push(s);
			}
		}
		int len = stack.size();
		for(i=0; i < len; i++) {
			sum += stack.pop();
		}
		return sum;
	}
}

import java.util.*;
import java.lang.*;


class OperandsAndOperations{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Operator and Operands");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a,b values: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.print("Enter operator: ");
		char operand = scn.next().charAt(0);
		switch(operand){
			case '+':
				System.out.print(a+" + "+b+" = "+(a+b));
				break;
			case '-':
				System.out.print(a+" - "+b+" = "+(a-b));
				break;
			case '/':
				System.out.print(a+" / "+b+" = "+(a/b));
				break;
			case '*':
				System.out.print(a+" * "+b+" = "+(a*b));
				break;
			case '%':
				System.out.print(a+" % "+b+" = "+(a%b));
				break;

		}

	}
}
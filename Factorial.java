import java.util.*;
import java.lang.*;

class Factorial{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = scn.nextInt();
		System.out.print("Factorial of "+num+" is : "+factorial(num));
	}
	public static int factorial(int num){
		if(num == 1){
			return 1;
		}
		else{
			return num * factorial(num-1);
		}
	}
}
import java.util.*;
import java.lang.*;

class SumAndPal{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565  -- HEMANTH  -- Sum of individual digits");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your digit: ");
		String givenNum = scn.nextLine();
		sumOfDigits(givenNum);
		isPal(givenNum);
	}

	public static void sumOfDigits(String a){
		int ans = 0;
		for(int index = 0; index<a.length(); index++){
			ans += ((int) a.charAt(index)-48);
		}
		System.out.println("Sum = "+ans);
	}

	public static void isPal(String a){
		StringBuilder sb = new StringBuilder(a);
		if(a.equals(sb.reverse().toString())){
			System.out.print("It is palindrome");
			System.exit(0);
		}
		else{
			System.out.print("Not a palindrome");
		}
	}
}
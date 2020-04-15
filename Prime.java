import java.util.*;
import java.lang.*;


class Prime{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565  -- HEMANTH  -- Prime Numbers");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		int givenNum = scn.nextInt();
		checkPrimer(givenNum);
	}

	public static void checkPrimer(int num){
		for(int i = 2; i< (int) Math.sqrt(num)+1; i++){
			if(num % i == 0){
				System.out.print("Not a prime");
				System.exit(0);
			}
		}
		System.out.print("Yes, its a prime");
	}
}
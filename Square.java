import java.util.*;
import java.lang.*;

class Square{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Square Of A Number");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number to square: ");
		int num = scn.nextInt();
		System.out.print("Square : "+(int)Math.pow(num,2));
	}
}
import java.util.*;

class Leap{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Leap Check");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = scn.nextInt();
		if(year%400==0||(year%4==0&&(year%100!=0)))System.out.print("It is a leap Year");
		else System.out.print("Not a leap year");
	}
}
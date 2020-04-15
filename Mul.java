import java.util.*;
import java.lang.*;


class Mul{
	public static void main(String[] args){
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Multiples of a number");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the multiplicant: ");
		int value = scn.nextInt();
		for(int i = 0; i <= 20; i++){
			System.out.println(value+"*"+i+"="+value*i);
		}
	}
}
import java.util.*;
import java.lang.*;


class Fibonacci{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Fibonacci Series");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the nth limit to generate the series: ");
		int limit = scn.nextInt();
		gen_fib(limit);
	}

	public static void gen_fib(int lim){
		int a = 0, b = 1, temp = 0;
		for(int i = 0; i< lim; i++){
			System.out.print(" "+b);
			temp = a;
			a = b;
			b +=temp;
		}
	}
}
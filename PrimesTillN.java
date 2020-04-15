import java.util.*;
import java.lang.*;

class PrimesTillN{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Prime Numbers");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the nth limit for generating primes: ");
		int n =  scn.nextInt();
		gen_primes(n);
	}

	public static void gen_primes(int n){
		for (int i = 1; i <= n; i++){
			if(check_num(i)){
				System.out.print(i+" ");
			}
		}
	}

	public static boolean check_num(int num){
		for(int i = 2; i < (int) Math.sqrt(num)+1; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}
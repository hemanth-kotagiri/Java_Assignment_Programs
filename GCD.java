import java.util.*;
import java.lang.*;

class GCD{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the two values: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		euclidsAlgorithm(a,b);
	}

	public static void euclidsAlgorithm(int a, int b){
		int temp = 0;
		while(true){
			temp = a%b;
			if(temp == 0){
				break;
			}
			a = b;
			b = temp;
		}
		System.out.print("GCD : "+b);
	}
}
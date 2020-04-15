import java.util.*;
import java.lang.*;

class PyramidNumbers{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Pyramid Numbers");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int limit = scn.nextInt();
		for(int i = 0; i<limit; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
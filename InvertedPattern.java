import java.util.Scanner;


class InvertedPattern{
	public static void main(String[] args) {
		System.out.println("\n\n185U1A0565 || HEMANTH || Inverted Stars of Pyramid\n\n");
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int limit = scn.nextInt();
		genPattern(limit);
	}

	public static void genPattern(int lim){
		for(int i = lim; i>1; i--){
			for(int j = 0; j<=lim-i; j++){
				System.out.print(" ");
			}
			int star = 0;
			while(star!=(i)-1){
				System.out.print("* ");
				star+=1;
			}
			System.out.println();
		}
	}
}
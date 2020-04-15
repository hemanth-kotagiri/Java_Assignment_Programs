import java.util.*;

class FloydTriangle{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Floyd's Triangle");
		System.out.println();
		System.out.print("Enter the number limit: ");
		int lim = scn.nextInt();
		int line=1,counter=1;
		for(int i = 1; i <= lim; i++){
			if(i == 1){
				System.out.println(i);
				line += 1;
			}
			else{
				if (counter == line){
					counter = 1;
					line+=1;
					System.out.println(i);
				}
				else{
					System.out.print(i+" ");
					counter+=1;
				}
			}
		}
	}
}
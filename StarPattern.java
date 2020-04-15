import java.util.*;

class StarPattern{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int lim = scn.nextInt();
		pattern(lim);
	}

	public static void pattern(int lim){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j<5; j++){
				if((i==1&&j==0)||(i==1&&j==4)||(i==2&&(j==0||j==1))||(i==2&&(j==4||j==3))){
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
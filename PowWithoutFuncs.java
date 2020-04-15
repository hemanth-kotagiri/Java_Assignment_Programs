import java.util.*;


class PowWithoutFuncs{
	public static void main(String[] args) {
		System.out.println("\n\n185U1A0565  -- HEMANTH  -- Power without inbuild functions\n\n");
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the digit: ");
		int digit = scn.nextInt();
		System.out.print("Enter the Power: ");
		int pow = scn.nextInt();
		if(pow==1){
			System.out.print(digit);
		}
		else{
			int ans = 0, increment = digit;
			for(int i = 0; i <pow; i++){
				for(int j = 1; j < digit; j++){
					ans += increment;
				}
				increment = ans;
			}
			System.out.print("Power : "+ans);
		}
	}
}
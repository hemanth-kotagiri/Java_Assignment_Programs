import java.util.*;


class SwapTwo{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = scn.nextInt(), b = scn.nextInt();
		System.out.print("Before swapping: ");
		System.out.println(a+" "+b);
		System.out.print("After swapping: ");
		a += b;
		b = a - b;
		a -= b;
		System.out.print(a+" "+b);
	}
}
import java.util.*;

class CToF{
	public static void main(String[] args) {
		System.out.println("\n185U1A0565 || HEMANTH || Leap Check\n\n");
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter temperature in degrees: ");
		float deg = scn.nextFloat();
		System.out.print("\ntemperature in Fahrenhite: "+(deg * 9/5) + 32);
	}
}
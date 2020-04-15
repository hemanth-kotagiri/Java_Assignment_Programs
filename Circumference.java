import java.util.*;
import java.lang.Math;

class Circumference{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Circumference of Circle");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		float rad = scn.nextFloat();
		System.out.print("The Circumference = "+2*Math.PI*rad);
	}
}
import java.util.*;
import java.lang.*;


class SimpleAndCompound{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Principle, Time in Years, Intrest in percentage: ");
		calculate(scn.nextFloat(),scn.nextFloat(),scn.nextFloat());
	}

	public static void calculate(float p, float t, float r){
		float simpleInt = p*t*(r/100)/100;
		float compoundInt = p*(float)Math.pow(1+(r/100),t)-p;
		System.out.println("Simple Intrest = "+simpleInt);
		System.out.print("compound Intrest = "+compoundInt);
	}
}
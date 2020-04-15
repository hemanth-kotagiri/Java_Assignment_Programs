import java.util.*;
import java.lang.*;

// Java doesn't support default parameters

class QuadraticClass{
	int a = 0;
	int b = 0;
	int c = 0;
	// constructor to initialize quadratic objects
	QuadraticClass(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// python dunder repr in java

	public void repr(){
		System.out.println("\n"+this.a+"x^2 +"+this.b+"x +"+this.c+"\n");
	}

	public void getRoots(){
		this.repr();
		double descriminant = (this.b*this.b-4*this.a*this.c);
		if(descriminant<0){
			System.out.println("The roots are imaginary:");
			System.out.println(((-1*this.b)/2*this.a) + " + i*"+(Math.sqrt(-1*descriminant))/2*this.a);
			System.out.println(((-1*this.b)/2*this.a) + " - i*"+(Math.sqrt(-1*descriminant))/2*this.a);
		}
		else{
			System.out.println("The roots are real:");
			System.out.println((-1*this.b+Math.sqrt(descriminant))/(double)2*this.a);
			System.out.println((-1*this.b-Math.sqrt(descriminant))/(double)2*this.a);
		}
	}
}


class RootsOfQuad {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Roots of Quadratic equations");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("How many quadratic equations?: ");
		int howMany = scn.nextInt();
		while(howMany!=0){
		System.out.print("\nEnter the coefficients(a,b,c): ");
		QuadraticClass quad = new QuadraticClass(scn.nextInt(),scn.nextInt(),scn.nextInt());
		quad.getRoots();
		howMany-=1;
		}
	}
}
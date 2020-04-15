import java.util.*;

// Takes less memory because we arent storing into array

class MinNumber{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("185U1A0565 || HEMANTH || Minimum number in array");
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = scn.nextInt();
		System.out.print("Enter the elements into the array: ");
		int min=0,now;
		for(int i = 0; i<size; i++){
			now = scn.nextInt();
			if(i==0){
				min = now;
			}
			else if (now < min){
				min = now;
			}
		}
		System.out.print("The minimum number is: "+min);
	}
}
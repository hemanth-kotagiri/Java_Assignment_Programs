import java.util.*;
import java.lang.*;

class ArmstrongNumbers{
	public static void main(String[] args){
		System.out.println();
		System.out.println("185U1A0565  -- HEMANTH  -- Armstrong Numbers");
		System.out.println();
		System.out.println("Armstrong numbers below 1000 are:");
		for(int i = 0; i<1000; i++){
			if(checkArmstrong(i)){
				System.out.println(i);
			}
		}
	}
	
	public static boolean checkArmstrong(int a){
		int toCheck = 0,temp = a,another=0;
		while(temp!=0){
			another = temp%10;
			toCheck += (int) Math.pow(another,String.valueOf(a).length());
			temp /= 10;
		}
		return toCheck==a;
	}
}
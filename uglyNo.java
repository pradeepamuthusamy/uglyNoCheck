//An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

//Given an integer n, return true if n is an ugly number.
import java.util.Scanner;

class uglyNo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(callUgly(num));
		
		
	}
	public static boolean callUgly(int n){
		if(n<=0) return false;
		int [] arr = {2,3,5};
		for(int factor:arr){
			while(n % factor == 0){
				n /= factor;
			}
		}
		return n == 1;
		
	}
}


undefined

package packagetest;

import java.util.Scanner;

public class CS380_Lab0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int x=scan.nextInt();
		
		int res=0;
		while(x>0) {
			int n = x%10;
			res = res*10+n;
			x=x/10;
		}
		System.out.println("Reverse of number: "+res);
	}
}

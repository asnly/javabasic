package four;

import java.util.Scanner;

public class Demo7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7 d=new Demo7();
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		System.out.println("First " + s + " Fibonacci number(s): ");
		for (int i = 0; i <k; i++) {
			System.out.println(d.fac(i));
		}
	}

	private static int fac(int i) {
		// TODO Auto-generated method stub
		if(i<2) return 1;
		return fac(i-2)+fac(i-1);
	}
}
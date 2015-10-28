package mathmatics;

import java.util.Scanner;

public class Calculator {
		private int num1,num2,ans;
		
		public void add(){ 
		Scanner sc = new Scanner(System.in);
		System.out.print("x:");
		num1 = sc.nextInt();
		System.out.print("y:");
		num2 = sc.nextInt();
		ans = num1 + num2;
		System.out.println("x + y = " + ans);
		}
		
		public void subtract(){ 
			Scanner sc = new Scanner(System.in);
			System.out.print("x:");
			num1 = sc.nextInt();
			System.out.print("y:");
			num2 = sc.nextInt();
			ans = num1 - num2;
			System.out.println("x - y = " + ans);
			}
}

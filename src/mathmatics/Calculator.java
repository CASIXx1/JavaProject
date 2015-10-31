package mathmatics;

import java.util.Scanner;

public class Calculator {
		private int num1,num2,ans;
		
		public int add(int num1, int num2){ 
			Scanner sc = new Scanner(System.in);
			ans = num1 + num2;
			System.out.println("X + Y = " + ans);
			return ans;
		}
		
		public int subtract(int num1, int num2){ 
			Scanner sc = new Scanner(System.in);
			ans = num1 - num2;
			System.out.println("X - Y = " + ans);
			return ans;
		}
		
		public int multiplication(int num1, int num2){ 
			Scanner sc = new Scanner(System.in);
			ans = num1 * num2;
			System.out.println("X * Y = " + ans);
			return ans;
		}
		
		public int division(int num1, int num2){ 
			Scanner sc = new Scanner(System.in);
			ans = num1 / num2;
			System.out.println("X / Y = " + ans);
			return ans;
		}
}

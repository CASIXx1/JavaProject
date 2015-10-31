package mathmatics;

public class Calculator {
		private int ans;
		
		public int add(int num1, int num2){ 
			ans = num1 + num2;
			System.out.println("X + Y = " + ans);
			return ans;
		}
		
		public int subtract(int num1, int num2){ 
			ans = num1 - num2;
			System.out.println("X - Y = " + ans);
			return ans;
		}
		
		public int multiplication(int num1, int num2){ 
			ans = num1 * num2;
			System.out.println("X * Y = " + ans);
			return ans;
		}
		
		public int division(int num1, int num2){ 
			ans = num1 / num2;
			System.out.println("X / Y = " + ans);
			return ans;
		}
}

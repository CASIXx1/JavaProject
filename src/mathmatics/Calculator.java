package mathmatics;

public class Calculator {
		private double ans;
		
		public double add(double num1, double num2){ 
			ans = num1 + num2;
			System.out.println("X + Y = " + ans);
			return ans;
		}
		
		public double subtract(double num1, double num2){ 
			ans = num1 - num2;
			System.out.println("X - Y = " + ans);
			return ans;
		}
		
		public double multiplication(double num1, double num2){ 
			ans = num1 * num2;
			System.out.println("X * Y = " + ans);
			return ans;
		}
		
		public double division(double num1, double num2){ 
			ans = num1 / num2;
			System.out.println("X / Y = " + ans);
			return ans;
		}
}

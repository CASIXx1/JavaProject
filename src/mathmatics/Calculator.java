package mathmatics;

public class Calculator {
		private double ans;
		
		public Calculator(double ans) {
			this.ans = ans;
		}
		
		public void add(double num1){ 
			ans += num1;
		}
		
		public void subtract(double num1){ 
			ans -= num1;
		}
		
		public void multiplication(double num1){ 
			ans *= num1;
		}
		
		public void division(double num1){ 
			ans /= num1;
		}

		public double getAns() {
			return ans;
		}

		public void setAns(double ans) {
			this.ans = ans;
		}
		
		
}
